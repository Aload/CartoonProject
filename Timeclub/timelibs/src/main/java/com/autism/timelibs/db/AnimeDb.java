package com.autism.timelibs.db;

import android.content.ContentValues;
import android.content.Context;

import com.autism.timelibs.utils.ViewUtil;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;

/**
 * Author：i5 on 2017/6/15 14:21
 * Used:Timeclub
 */
public class AnimeDb {
    private static AnimeDb mAnimeDb;
    private AnimeSQLhelper mAnimHelper;


    public static AnimeDb getmAnimeDb() {
        if (mAnimeDb == null) {
            synchronized (AnimeDb.class) {
                if (mAnimeDb == null) {
                    mAnimeDb = new AnimeDb();
                }
            }
        }
        return mAnimeDb;
    }

    public void initAnimeDb(Context mContext, String name) {
        if (null == mAnimeDb) {
            synchronized (AnimeDb.class) {
                if (mAnimHelper == null) {
                    mAnimHelper = new AnimeSQLhelper(mContext, name);
                }
            }
        }
    }

    /**
     * 插入数据库
     *
     * @param key
     * @param value
     */
    public void insertDb(String mDbName, String key, String value, long time) {
        boolean checkDb = checkDb(mDbName, key, time);
        if (!checkDb) return;
        mAnimHelper.setWriteAheadLoggingEnabled(true);
        SQLiteDatabase mDB = mAnimHelper.getWritableDatabase();
        if (mDB == null || !mDB.isOpen())
            return;
        ContentValues mValuse = new ContentValues();
        mValuse.put(key, value);
        long insert = mDB.insert(IAnimeInterface.WORLD_DB, key, mValuse);
    }

    /**
     * 检查数据是否存在数据
     *
     * @param mDbName
     * @param key
     * @param time
     * @return
     */
    private boolean checkDb(String mDbName, String key, long time) {
        boolean isboolean;
        SQLiteDatabase readableDatabase = mAnimHelper.getReadableDatabase();
        Cursor cursor = readableDatabase.rawQuery("select " + key + " from " + mDbName, null);
        boolean moveToNext = cursor.moveToNext();
        if (moveToNext) {
            int columnIndex = cursor.getColumnIndex(key);
            String mJson = cursor.getString(columnIndex);
            if (!ViewUtil.isNullOrEmpty(mJson)) {
                int time1 = cursor.getColumnIndex("time");
                String mTime = cursor.getString(time1);
                long mTimes = Long.parseLong(mTime);
                if (time - mTimes >= 86400) {
                    //更新数据
                } else return false;
            } else {

            }
        }
        return true;
    }
}
