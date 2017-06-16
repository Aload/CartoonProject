package com.autism.timeclub.mine.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timeclub.mine.view.InfoHolder;

import java.util.List;

/**
 * Author：autism on 2017/6/16 11:03
 * Used:Timeclub
 */
public class InfoAdapter extends RecyclerView.Adapter<InfoHolder> {
    private List<InfoBean.StatussBean> mList;

    @Override
    public InfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new InfoHolder(parent, R.layout.info_item);
    }

    @Override
    public void onBindViewHolder(InfoHolder holder, int position) {
        InfoBean.StatussBean statusBean = mList.get(position);
        holder.setData(statusBean);
    }

    @Override
    public int getItemCount() {
        return null == mList ? 0 : mList.size();
    }

    /**
     * 刷新Ui
     *
     * @param mData
     */
    public void updateUi(List<InfoBean.StatussBean> mData) {
        if (null == mData || mData.isEmpty()) return;
        this.mList = mData;
        notifyDataSetChanged();
    }
}
