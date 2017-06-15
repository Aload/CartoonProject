package com.autism.timeclub.splash;

import android.content.Intent;

import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseAct;
import com.autism.timeclub.base.common.GlobalCommon;
import com.autism.timeclub.main.MainActivity;
import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.http.IPresenter;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.utils.SpUtils;
import com.autism.timelibs.utils.ViewUtil;

/**
 * Author：autism on 2017/6/12 16:03
 * Used:Timeclub
 */
public class SplashAct extends BaseAct<SplashPre> implements ISplashView {
    @Override
    protected SplashPre getPresenter() {
        return new SplashPre(this, this);
    }

    @Override
    protected void initView() {
        super.initView();
        LogicUtils.getHandler(this).postDelayed(new Runnable() {
            @Override
            public void run() {
                int mFirst = SpUtils.getInstance().readInteger(GlobalCommon.FIRST_ENTER, 0);
                if (mFirst == 0) {
                    Intent intent = new Intent(SplashAct.this, GuideAct.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(SplashAct.this, MainActivity.class);
                    startActivity(intent);
                }
                finish();
                ViewUtil.left2RightOut(SplashAct.this);
            }
        }, 2000);
    }

    @Override
    protected int getRlayoutId() {
        return R.layout.splash_act;
    }
}
