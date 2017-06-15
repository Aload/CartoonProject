package com.autism.timelibs.db;

import android.content.Context;
import android.util.Log;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteOpenHelper;
import com.tencent.wcdb.repair.RepairKit;

/**
 * Author：autism on 2017/6/15 13:54
 * Used:Timeclub
 */
public class AnimeSQLhelper extends SQLiteOpenHelper {

    private static final String TAG = AnimeSQLhelper.class.getSimpleName();
    private static final int DATABASE_VERSION = 2;
    private String mPassphrase;

    public AnimeSQLhelper(Context context, String name) {
        // Call "encrypted" version of the superclass constructor.
        super(context, name, name.getBytes(), null, null, DATABASE_VERSION,
                null);
        mPassphrase = name;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(IAnimeInterface.SQL);
        // OPTIONAL: backup master info for corruption recovery.
        RepairKit.MasterInfo.save(db, db.getPath() + "-mbak", mPassphrase.getBytes());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, String.format("Upgrading database from version %d to version %d.",
                oldVersion, newVersion));
        // Add new column to message table on database upgrade.
        db.execSQL("ALTER TABLE message ADD COLUMN sender TEXT;");
        // OPTIONAL: backup master info for corruption recovery.
        RepairKit.MasterInfo.save(db, db.getPath() + "-mbak", mPassphrase.getBytes());
    }
}
