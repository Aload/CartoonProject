package com.autism.timelibs.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /**
     * 判断是否是手机号码
     *
     * @param mobiles
     * @return
     */
    public static boolean isMobileNumber(String mobiles) {
        Pattern p = Pattern.compile("^(13|14|15|17|18)\\d{9}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
}
