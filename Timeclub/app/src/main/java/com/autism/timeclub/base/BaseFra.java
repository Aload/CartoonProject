package com.autism.timeclub.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timelibs.http.IPresenter;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.utils.ViewUtil;
import com.autism.timelibs.view.refresh.SpringView;
import com.autism.timelibs.view.refresh.TimeHeader;

/**
 * Author：autism on 2017/6/13 09:18
 * Used:Timeclub
 */
public abstract class BaseFra<T extends IPresenter> extends Fragment implements SpringView.OnFreshListener {
    protected T mPresenter;
    protected SpringView mRefresh;
    protected static final String TAG = BaseFra.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(getFraRlayoutId(), null);
        mPresenter = getPresenter();
        if (null != mPresenter) mPresenter.attachView();
        initFraView(mView);
        return mView;
    }

    protected void initFraView(View mView) {
        mRefresh = (SpringView) mView.findViewById(R.id.sp_refresh);
        if (null != mRefresh) {
            mRefresh.setHeader(new TimeHeader(getActivity()));
            mRefresh.setType(SpringView.Type.FOLLOW);
            mRefresh.setListener(this);
        }
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

    protected abstract T getPresenter();

    protected abstract int getFraRlayoutId();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onRefresh() {
        LogicUtils.getHandler(getActivity()).postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.onFinishFreshAndLoad();
            }
        }, 2000);
    }

    @Override
    public void onLoadmore() {
        LogicUtils.getHandler(getActivity()).postDelayed(new Runnable() {
            @Override
            public void run() {
                mRefresh.onFinishFreshAndLoad();
            }
        }, 2000);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) mPresenter.detachView();
    }
}
