package com.autism.timeclub.Foreign.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timeclub.Foreign.view.RecommonHolder;
import com.autism.timeclub.R;

import java.util.List;

/**
 * Author：autism on 2017/6/15 17:00
 * Used:Timeclub
 */
public class RecommonAdapter extends RecyclerView.Adapter<RecommonHolder> {
    private List<RecommonBean.GroupBean> mData;

    @Override
    public RecommonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecommonHolder(parent, R.layout.recommon_item);
    }

    @Override
    public void onBindViewHolder(RecommonHolder holder, int position) {
        RecommonBean.GroupBean groupBean = mData.get(position);
        holder.setData(groupBean);

    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }

    /**
     * 刷新Ui
     *
     * @param mList
     */
    public void notifyUi(List<RecommonBean.GroupBean> mList) {
        if (null == mList || mList.isEmpty()) return;
        this.mData = mList;
        notifyDataSetChanged();
    }
}
