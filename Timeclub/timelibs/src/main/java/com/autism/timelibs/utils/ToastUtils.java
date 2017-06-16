package com.autism.timelibs.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Author：autism on 2017/6/16 18:04
 * Used:Timeclub
 */
public class ToastUtils {
    /**
     * 吐司
     *
     * @param mContext
     * @param msg
     */
    public static void showToast(Context mContext, String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}
