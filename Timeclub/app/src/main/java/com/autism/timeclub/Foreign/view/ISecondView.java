package com.autism.timeclub.Foreign.view;

import com.autism.timeclub.Foreign.model.LikeBean;
import com.autism.timelibs.http.IView;

/**
 * Author：i5 on 2017/6/20 16:56
 * Used:Timeclub
 */
public interface ISecondView extends IView {
    void getSuccessLikeBean(LikeBean mData);

    void getErrorLikeBean(String msg);

}
