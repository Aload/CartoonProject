package com.autism.timeclub.Foreign.view;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.Foreign.pre.CommentAdapter;
import com.autism.timeclub.Foreign.pre.ThirdPre;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.view.refresh.TwinklingRefreshLayout;

/**
 * Author：autism on 2017/6/20 16:57
 * Used:Timeclub
 */
public class ThirdFragment extends BaseFra<ThirdPre> implements IThirdView {
    private CommentAdapter mCommentAdapter;
    private String mStatusId;
    private volatile int page = 1;
    private volatile int pageSize = 20;

    @Override
    protected ThirdPre getPresenter() {
        return new ThirdPre(getActivity(), this, mStatusId, page, pageSize);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.third_layout;
    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        Bundle arguments = getArguments();
        mStatusId = arguments.getString("statusId");
        RecyclerView mRecyclerView = (RecyclerView) mView.findViewById(R.id.rv_click);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.HORIZONTAL));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mCommentAdapter = new CommentAdapter();
        mRecyclerView.setAdapter(mCommentAdapter);
    }

    @Override
    public void onRefreshs(TwinklingRefreshLayout refreshLayout) {
        mPresenter.getCommentRes(mStatusId, 1, 20);
    }

    @Override
    public void onLoadMores(final TwinklingRefreshLayout refreshLayout) {
        mPresenter.getCommentRes(mStatusId, ++page, 20);
    }

    @Override
    public void getCommentSuccess(CommentBean mData) {
        if (mRefresh != null) {
            mRefresh.onFinishRefresh();
        }
        mCommentAdapter.notifyUi(mData.getLikeUsers());
    }

    @Override
    public void getCommentError(String msg) {
        LineLog.e(TAG, msg);
        if (mRefresh != null) {
            mRefresh.onFinishRefresh();
        }
    }
}
