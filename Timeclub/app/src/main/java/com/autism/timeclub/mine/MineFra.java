package com.autism.timeclub.mine;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseFra;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timeclub.mine.pre.InfoAdapter;
import com.autism.timelibs.utils.LineLog;

/**
 * Author：autism on 2017/6/13 10:03
 * Used:Timeclub
 */
public class MineFra extends BaseFra<MinePre> implements IMineView {
    private InfoAdapter mInfoAdapter;

    @Override
    protected MinePre getPresenter() {
        return new MinePre(getActivity(), this, 1, 10);
    }

    @Override
    protected int getFraRlayoutId() {
        return R.layout.mine_layout;
    }

    @Override
    protected void initFraView(View mView) {
        super.initFraView(mView);
        RecyclerView mRecycler = (RecyclerView) mView.findViewById(R.id.rv_info);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mInfoAdapter = new InfoAdapter();
        mRecycler.setAdapter(mInfoAdapter);
    }

    @Override
    public void getAttentionSuccess(InfoBean mData) {
        mInfoAdapter.updateUi(mData.getStatuss());

    }

    @Override
    public void getAttentionError(String msg) {
        LineLog.e(TAG, msg);
    }
}
