package com.autism.timeclub;

import android.app.Application;

import com.autism.timeclub.base.common.GlobalCommon;
import com.autism.timelibs.TimeApp;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.utils.SpUtils;

/**
 * Author:autism on 2017/6/12 16:34
 * Used:Timeclub
 */
public class LineApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TimeApp.AsyTimeApp(this);
        LineLog.getmLineLog().initLog(this);
        SpUtils.getInstance().initSp(this, GlobalCommon.SPFILE);
    }
}

