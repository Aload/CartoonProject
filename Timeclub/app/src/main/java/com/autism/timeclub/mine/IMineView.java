package com.autism.timeclub.mine;

import com.autism.timeclub.mine.model.InfoBean;
import com.autism.timelibs.http.IView;

/**
 * Author：autism on 2017/6/13 10:04
 * Used:Timeclub
 */
public interface IMineView extends IView {
    void getAttentionSuccess(InfoBean mData);


    void getAttentionError(String msg);
}
