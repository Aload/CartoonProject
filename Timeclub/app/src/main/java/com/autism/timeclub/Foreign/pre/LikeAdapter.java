package com.autism.timeclub.Foreign.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timeclub.Foreign.view.LikeHolder;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.IOnItemClickListener;

import java.util.List;

/**
 * Author：i5 on 2017/6/22 17:39
 * Used:Timeclub
 */
public class LikeAdapter extends RecyclerView.Adapter<LikeHolder> {
    private List<LikeBean.OtherCommentsBean> mData;
    private IOnItemClickListener mItemClick;


    public void setItemClick(IOnItemClickListener mItemClick) {
        this.mItemClick = mItemClick;
    }

    @Override
    public LikeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LikeHolder(parent, R.layout.like_item);
    }

    @Override
    public void onBindViewHolder(LikeHolder holder, int position) {
        LikeBean.OtherCommentsBean otherCommentsBean = mData.get(position);
        holder.setData(otherCommentsBean);
        holder.setOnClickItem(mItemClick);
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
    public void notifyUi(List<LikeBean.OtherCommentsBean> mList) {
        if (mList == null || mList.isEmpty()) return;
        this.mData = mList;
        notifyDataSetChanged();
    }
}
