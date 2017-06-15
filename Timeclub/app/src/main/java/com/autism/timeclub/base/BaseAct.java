package com.autism.timeclub.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.autism.timelibs.http.IPresenter;
import com.autism.timelibs.utils.ViewUtil;
import com.autism.timelibs.view.refresh.SpringView;

/**
 * Author：autism on 2017/6/12 14:59
 * Used:Timeclub
 */
public abstract class BaseAct<T extends IPresenter> extends AppCompatActivity {

    protected IPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getRlayoutId());
        initView();
        mPresenter = getPresenter();
        if (null != mPresenter) mPresenter.attachView();
    }

    /**
     * 网络数据
     *
     * @return
     */
    protected abstract IPresenter getPresenter();

    /**
     * 初始化view
     */
    protected void initView() {
//        SpringView mRefresh = (SpringView) findViewById(R.id.refresh_sp);
//        if (null != mRefresh) {
//            mRefresh.setListener(this);
//            mRefresh.setHeader(new TimeHeader(this));
//        }
    }

    /**
     * 测量控件位置
     *
     * @param view
     * @param width
     * @param height
     */
    protected void measure(View view, int width, int height) {
        ViewUtil.measure(view, width, height);
    }

    /**
     * 初始化布局文件
     *
     * @return
     */
    protected abstract int getRlayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mPresenter) mPresenter.detachView();
    }
}
