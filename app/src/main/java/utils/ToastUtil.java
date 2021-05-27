package utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static Toast mToast;

    //取消连续点击显示2秒
    public static void showMsg(Context context, String msg){
        if(mToast == null){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }else{
            mToast.setText(msg);
        }
        mToast.show();
    }

}
