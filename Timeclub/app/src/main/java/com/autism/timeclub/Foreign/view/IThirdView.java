package com.autism.timeclub.Foreign.view;

import com.autism.timeclub.Foreign.model.CommentBean;
import com.autism.timelibs.http.IView;

/**
 * Author：i5 on 2017/6/20 16:58
 * Used:Timeclub
 */
public interface IThirdView extends IView {
    void getCommentSuccess(CommentBean mData);

    void getCommentError(String msg);
}
