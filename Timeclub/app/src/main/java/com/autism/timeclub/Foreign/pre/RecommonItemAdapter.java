package com.autism.timeclub.Foreign.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.Foreign.view.RecommonItemHolder;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.IOnItemClickListener;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.home.view.HotHeaderHolder;

import java.util.List;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class RecommonItemAdapter extends RecyclerView.Adapter<RecommonItemHolder> {
    private List<RecommonBean.GroupBean.StatussBean> mHotList;
    private IOnItemClickListener mItemClickListener;

    @Override
    public RecommonItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommonItemHolder(parent, R.layout.header_item);
    }

    @Override
    public void onBindViewHolder(RecommonItemHolder holder, int position) {
        RecommonBean.GroupBean.StatussBean statussBean = mHotList.get(position);
        holder.setData(statussBean);
        holder.setOnClickItem(mItemClickListener);
    }

    public void setOnclickItem(IOnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public int getItemCount() {
        return null == mHotList ? 0 : mHotList.size();
    }

    public void updateUi(List<RecommonBean.GroupBean.StatussBean> mData) {
        if (mData == null || mData.isEmpty()) return;
        this.mHotList = mData;
        notifyDataSetChanged();
    }
}
