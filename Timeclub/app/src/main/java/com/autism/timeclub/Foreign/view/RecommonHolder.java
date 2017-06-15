package com.autism.timeclub.Foreign.view;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.Foreign.pre.RecommonItemAdapter;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.BaseRecyclerHolder;
import com.autism.timelibs.view.glide.GlideUtils;

/**
 * Author：autism on 2017/6/15 17:01
 * Used:Timeclub
 */
public class RecommonHolder extends BaseRecyclerHolder<RecommonBean.GroupBean> {
    private ImageView mImage;
    private TextView mName;
    private RecyclerView mRecycler;

    public RecommonHolder(ViewGroup parent, int res) {
        super(parent, res);
        mImage = $(R.id.iv_sort);
        mName = $(R.id.tv_name);
        mRecycler = $(R.id.rv_view_header);
    }

    @Override
    public void setData(RecommonBean.GroupBean mData) {
        GlideUtils.withNetDefaultImg(getContext(), mImage, mData.getIcon(), 0);
        mName.setText(mData.getName());
        mRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecommonItemAdapter mItemAdapter = new RecommonItemAdapter();
        mRecycler.setAdapter(mItemAdapter);
        mItemAdapter.updateUi(mData.getStatuss());
    }
}
