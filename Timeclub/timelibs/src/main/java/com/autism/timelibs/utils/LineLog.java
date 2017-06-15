package com.autism.timelibs.utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Author：autism on 2017/6/12 17:02
 * Used:Timeclub
 * <p>
 * 提供一个全局log管理器,为全局的application提供log输出,log上传,可控
 * log是否输出
 */
public class LineLog {
    private static String mSaveUrl = Environment.getExternalStorageDirectory().getAbsolutePath() + "/log_error";
    private String mLogFileName = "time_log.properties";
    private static boolean mIsDebug = true;
    private static boolean mIsSaveFile = false;

    private static LineLog mLineLog;

    public static LineLog getmLineLog() {
        if (null == mLineLog) {
            synchronized (LineLog.class) {
                if (null == mLineLog) {
                    mLineLog = new LineLog();
                }
            }
        }
        return mLineLog;
    }

    /**
     * 初始化log信息
     *
     * @param mContext
     */
    public void initLog(Context mContext) {
        Properties mProPerties = new Properties();
        initStream(mContext, mProPerties);
        initVariable(mProPerties);
    }

    /**
     * 初始化文件
     *
     * @param mProPerties
     */
    private void initVariable(Properties mProPerties) {
        mIsDebug = Boolean.parseBoolean(mProPerties.getProperty("isDebug"));
        mIsSaveFile = Boolean.parseBoolean(mProPerties.getProperty("isSaveFile"));
    }

    private void initStream(Context mContext, Properties mProPerties) {
        try {
            InputStream stream = mContext.getAssets().open(mLogFileName);
            mProPerties.load(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 输出debug日志
     *
     * @param mTag
     * @param msg
     */
    public static void d(String mTag, String msg) {
        if (mIsDebug) {
            Log.d(mTag, msg);
        }
    }

    /**
     * info 信息
     *
     * @param mTag
     * @param msg
     */
    public static void i(String mTag, String msg) {
        if (mIsDebug) {
            Log.i(mTag, msg);
        }
    }

    /**
     * 输出错误的信息
     *
     * @param mTag
     * @param msg
     */
    public static void e(String mTag, String msg) {
        if (mIsDebug) {
            Log.e(mTag, msg);
        }
        if (mIsSaveFile) {
            String line = msg.toString() + "\n";
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(mSaveUrl + DateFormatUtil.format(DateFormatUtil.FORMAT_2) + ".log", true); // 内容追加方式append
                fos.write(line.getBytes());
            } catch (IOException e) {
                Log.e(mTag, e.getMessage() + "save log failed:" + e.toString());
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        Log.e(mTag, e.getMessage() + "close FileOutputStream failed after save log:" + e.toString());
                    }
                }
            }
        }
    }
}
