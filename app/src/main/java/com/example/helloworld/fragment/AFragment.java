package com.example.helloworld.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.helloworld.R;

public class AFragment extends Fragment {
    private TextView title;
    private Button change;
    private Button reset;
    private Button message;
    private BFragment bFragment;
    private IOnMessageClick iOnMessageClick;


    public static AFragment newInstance(String title){
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        aFragment.setArguments(bundle);
        return aFragment;
    }

    public interface IOnMessageClick{
        void onClick(String text);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        Log.d("AFrament","--------onCreateView--------------");
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            iOnMessageClick = (IOnMessageClick) context;
        }catch (ClassCastException e){
            throw new ClassCastException("实现iOnMessageClick接口");
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        title = view.findViewById(R.id.tv_title);
        change = view.findViewById(R.id.change);
        reset = view.findViewById(R.id.reset);
        message = view.findViewById(R.id.btn_message);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ((ContainerActivity)getActivity()).setData("你好");
                iOnMessageClick.onClick("你好");

            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bFragment == null){
                    bFragment = new BFragment();
                }
                Fragment fragment = getFragmentManager().findFragmentByTag("a");
                if(fragment != null){
                    getFragmentManager()
                            .beginTransaction()
                            .hide(fragment)
                            .add(R.id.fl_contation,bFragment)
                            .addToBackStack(null)
                            .commitAllowingStateLoss();
                }else{

                    getFragmentManager().beginTransaction()
                            .replace(R.id.fl_contation,bFragment)
                            .addToBackStack(null)
                            .commitAllowingStateLoss();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("neirong");
            }
        });

        if (getArguments() != null) {
            title.setText(getArguments().getString("title"));
        }

    }

}
