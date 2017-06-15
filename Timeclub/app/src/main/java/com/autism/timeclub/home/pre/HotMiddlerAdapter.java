package com.autism.timeclub.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.home.view.HotHeaderHolder;
import com.autism.timeclub.home.view.HotMiddlerHolder;

import java.util.List;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotMiddlerAdapter extends RecyclerView.Adapter<HotMiddlerHolder> {
    private List<HotBean.DramaStorysBean.StatussBeanX> mData;

    @Override
    public HotMiddlerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotMiddlerHolder(parent, R.layout.middler_item);
    }

    @Override
    public void onBindViewHolder(HotMiddlerHolder holder, int position) {
        HotBean.DramaStorysBean.StatussBeanX statussBeanX = mData.get(position);
        holder.setData(statussBeanX);
    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }

    public void updateUi(List<HotBean.DramaStorysBean.StatussBeanX> mBeanList) {
        if (null == mBeanList || mBeanList.isEmpty()) return;
        this.mData = mBeanList;
        notifyDataSetChanged();
    }
}
