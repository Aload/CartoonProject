package com.autism.timeclub.Foreign.view;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.Foreign.pre.FirstAdapter;
import com.autism.timeclub.Foreign.pre.FirstPre;
import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timeclub.base.holder.IOnItemClickListener;
import com.autism.timelibs.utils.LineLog;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.view.refresh.TwinklingRefreshLayout;

/**
 * Author：autism on 2017/6/20 16:54
 * Used:Timeclub
 */
public class FirstFragment extends BaseFra<FirstPre> implements IFirstView, IOnItemClickListener {
    private FirstAdapter mFirstAdapter;
    private String mStoryId;
    private String mStatusId;

    @Override
    protected FirstPre getPresenter() {
        return new FirstPre(getActivity(), this, mStoryId, mStatusId);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.first_layout;
    }

    @Override
    public void onRefreshs(final TwinklingRefreshLayout refreshLayout) {
        LogicUtils.getHandler(getActivity()).postDelayed(new Runnable() {
            @Override
            public void run() {
                refreshLayout.onFinishRefresh();
            }
        }, 4000);
    }

    @Override
    public void onLoadMores(TwinklingRefreshLayout refreshLayout) {

    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        Bundle arguments = getArguments();
        mStoryId = arguments.getString("storyId");
        mStatusId = arguments.getString("statusId");
        RecyclerView mRecommentRecycler = (RecyclerView) mView.findViewById(R.id.rv_recomment);
        mRecommentRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        mFirstAdapter = new FirstAdapter();
        mRecommentRecycler.setAdapter(mFirstAdapter);
        mFirstAdapter.setItemClick(this);
    }

    @Override
    public void getContentSuccess(FirstBean mData) {
        mFirstAdapter.notifyUi(mData.getStatuss());
    }

    @Override
    public void getContentError(String msg) {
        LineLog.e(TAG, msg);
    }

    @Override
    public void onClickListener(int position) {

    }
}
