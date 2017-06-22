package com.autism.timeclub.Foreign.view;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.Foreign.pre.LikeAdapter;
import com.autism.timeclub.Foreign.pre.SecondPre;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.view.refresh.TwinklingRefreshLayout;

/**
 * Author：autism on 2017/6/20 16:55
 * Used:Timeclub
 */
public class SecondFragment extends BaseFra<SecondPre> implements ISecondView {
    private String mStatusId;
    private int mPage = 1;
    private int mPageSize = 20;
    private LikeAdapter mLikeAdapter;

    @Override
    protected SecondPre getPresenter() {
        return new SecondPre(getActivity(), this, mStatusId, mPage, mPageSize);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.second_layout;
    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        Bundle arguments = getArguments();
        mStatusId = arguments.getString("statusId");
        RecyclerView mRecycle = (RecyclerView) mView.findViewById(R.id.rv_like);
        mRecycle.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL));
        mRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        mLikeAdapter = new LikeAdapter();
        mRecycle.setAdapter(mLikeAdapter);
    }

    @Override
    public void onRefreshs(TwinklingRefreshLayout refreshLayout) {
        mPresenter.getLikeNetRes(mStatusId, 1, 20);
    }

    @Override
    public void onLoadMores(TwinklingRefreshLayout refreshLayout) {
        mPresenter.getLikeNetRes(mStatusId, ++mPage, mPageSize + 20);
    }

    @Override
    public void getSuccessLikeBean(LikeBean mData) {
        if (null != mRefresh) mRefresh.onFinishRefresh();
        mLikeAdapter.notifyUi(mData.getOtherComments());
    }

    @Override
    public void getErrorLikeBean(String msg) {
        if (null != mRefresh) mRefresh.onFinishRefresh();
        LineLog.e(TAG, msg);
    }
}
