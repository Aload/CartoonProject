package com.autism.timeclub.Foreign.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timeclub.Foreign.view.FirstHolder;
import com.autism.timeclub.R;
import com.autism.timeclub.base.holder.IOnItemClickListener;

import java.util.List;

/**
 * Author：autism on 2017/6/21 14:07
 * Used:Timeclub
 */
public class FirstAdapter extends RecyclerView.Adapter<FirstHolder> {
    private List<FirstBean.StatussBean> mDataBean;
    private IOnItemClickListener ItemClickListener;

    @Override
    public FirstHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FirstHolder(parent, R.layout.first_item);
    }

    @Override
    public void onBindViewHolder(FirstHolder holder, int position) {
        FirstBean.StatussBean statussBean = mDataBean.get(position);
        holder.setData(statussBean);
        holder.setOnClickItem(ItemClickListener);
    }

    /**
     * 设置item click
     *
     * @param itemClick
     */
    public void setItemClick(IOnItemClickListener itemClick) {
        this.ItemClickListener = itemClick;
    }

    @Override
    public int getItemCount() {
        return null == mDataBean ? 0 : mDataBean.size();
    }

    public void notifyUi(List<FirstBean.StatussBean> mList) {
        if (null == mList || mList.isEmpty()) return;
        this.mDataBean = mList;
        notifyDataSetChanged();
    }
}
