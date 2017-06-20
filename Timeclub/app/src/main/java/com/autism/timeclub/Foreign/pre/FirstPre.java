package com.autism.timeclub.Foreign.pre;

import android.app.Activity;

import com.autism.timeclub.Foreign.view.IFirstView;
import com.autism.timelibs.http.BasePresenter;

/**
 * Author：i5 on 2017/6/20 16:54
 * Used:Timeclub
 */
public class FirstPre extends BasePresenter<IFirstView> {
    public FirstPre(Activity activity, IFirstView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {

    }
}
