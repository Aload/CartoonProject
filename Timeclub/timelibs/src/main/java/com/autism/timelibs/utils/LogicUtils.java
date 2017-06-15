package com.autism.timelibs.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * Author：autism on 2017/6/12 16:14
 * Used:Timeclub
 */
public class LogicUtils {
    public static Handler getHandler(Context mContext) {
        Looper mainLooper = mContext.getMainLooper();
        Handler mHandler = new Handler(mainLooper);
        return mHandler;
    }
}
