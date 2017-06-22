package com.autism.timeclub.Foreign.pre;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timeclub.Foreign.view.CommentHolder;
import com.autism.timeclub.R;

import java.util.List;

/**
 * Author：autism on 2017/6/22 16:05
 * Used:Timeclub
 */
public class CommentAdapter extends RecyclerView.Adapter<CommentHolder> {
    private List<CommentBean.LikeUsersBean> mData;

    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CommentHolder(parent, R.layout.comment_item);
    }

    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {
        CommentBean.LikeUsersBean likeUsersBean = mData.get(position);
        holder.setData(likeUsersBean);
    }

    @Override
    public int getItemCount() {
        return null == mData ? 0 : mData.size();
    }

    public void notifyUi(List<CommentBean.LikeUsersBean> mList) {
        if (mList == null || mList.isEmpty()) return;
        this.mData = mList;
        notifyDataSetChanged();
    }
}
