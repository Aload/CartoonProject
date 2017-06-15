package com.autism.timelibs;

import android.content.Context;

/**
 * Author：autism on 2017/6/12 14:27
 * Used:Timeclub
 */
public class TimeApp {

    private static Context mContext;

    public static void AsyTimeApp(Context mContexts) {
        mContext = mContexts;
    }

    public static Context getmContext() {
        return mContext;
    }

}
