package com.autism.timeclub.main;

import android.app.Activity;

import com.autism.timelibs.http.BasePresenter;

/**
 * Author：autism on 2017/6/12 15:57
 * Used:Timeclub
 */
public class IMainPre extends BasePresenter<IMainView> {

    public IMainPre(Activity activity, IMainView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {

    }
}
