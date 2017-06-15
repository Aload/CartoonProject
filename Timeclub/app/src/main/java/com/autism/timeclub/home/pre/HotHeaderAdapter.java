package com.autism.timeclub.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.home.view.HotHeaderHolder;

import java.util.List;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotHeaderAdapter extends RecyclerView.Adapter<HotHeaderHolder> {
    private List<HotBean.RankListBean.StatussBean> mHotList;

    @Override
    public HotHeaderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotHeaderHolder(parent, R.layout.header_item);
    }

    @Override
    public void onBindViewHolder(HotHeaderHolder holder, int position) {
        HotBean.RankListBean.StatussBean statussBean = mHotList.get(position);
        holder.setData(statussBean);
    }

    @Override
    public int getItemCount() {
        return null == mHotList ? 0 : mHotList.size();
    }

    public void updateUi(List<HotBean.RankListBean.StatussBean> mData) {
        if (mData == null || mData.isEmpty()) return;
        this.mHotList = mData;
        notifyDataSetChanged();
    }
}
