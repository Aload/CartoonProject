package com.autism.timelibs.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Author：autism on 2017/6/12 16:17
 * Used:Timeclub
 */
public class SpUtils {
    private static SpUtils mSp;
    private SharedPreferences mSharedPreferences;

    /**
     * 一般在application中初始化整个sp
     *
     * @param mContext
     * @param mDir
     */
    public void initSp(Context mContext, String mDir) {
        mSharedPreferences = mContext.getSharedPreferences(mDir, mContext.MODE_PRIVATE);
    }

    /**
     * 获取实例
     *
     * @return
     */
    public static SpUtils getInstance() {
        if (mSp == null) {
            synchronized (SpUtils.class) {
                if (null == mSp) {
                    mSp = new SpUtils();
                }
            }
        }
        return mSp;
    }

    /**
     * 写入integer数据
     *
     * @param key
     * @param value
     */
    public void writeInteger(String key, int value) {
        SharedPreferences.Editor mEdit = mSharedPreferences.edit();
        mEdit.putInt(key, value);
        mEdit.apply();
    }

    /**
     * 读取integer数据
     *
     * @param key
     * @param defaultRes
     */
    public int readInteger(String key, int defaultRes) {
        int anInt = mSharedPreferences.getInt(key, defaultRes);
        return anInt;
    }

    /**
     * 写入string数据
     *
     * @param key
     * @param value
     */
    public void writeString(String key, String value) {
        SharedPreferences.Editor edit = mSharedPreferences.edit();
        edit.putString(key, value);
    }

    /**
     * 获取存入的string数据
     *
     * @param key
     * @return
     */
    public String readString(String key) {
        String mMsg = mSharedPreferences.getString(key, "");
        return mMsg;
    }
}
