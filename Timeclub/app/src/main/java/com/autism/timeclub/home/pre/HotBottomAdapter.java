package com.autism.timeclub.home.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.R;
import com.autism.timeclub.home.model.HotBean;
import com.autism.timeclub.home.view.HotBottomHolder;
import com.autism.timeclub.home.view.HotHeaderHolder;

import java.util.List;

/**
 * Author：autism on 2017/6/14 16:01
 * Used:Timeclub
 */
public class HotBottomAdapter extends RecyclerView.Adapter<HotBottomHolder> {
    private List<HotBean.SuggestUserBean> mData;

    @Override
    public HotBottomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HotBottomHolder(parent, R.layout.bottom_item);
    }

    @Override
    public void onBindViewHolder(HotBottomHolder holder, int position) {
        HotBean.SuggestUserBean suggestUserBean = mData.get(position);
        holder.setData(suggestUserBean);
    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }

    public void updateUi(List<HotBean.SuggestUserBean> mListData) {
        if (null == mListData || mListData.isEmpty()) return;
        this.mData = mListData;
        notifyDataSetChanged();
    }
}
