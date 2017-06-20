package com.autism.timeclub.Foreign.view;

import com.autism.timeclub.Foreign.model.DetailBean;
import com.autism.timelibs.http.IView;

/**
 * Author：autism on 2017/6/20 15:14
 * Used:Timeclub
 */
public interface IDetailView extends IView {
    void getDetailSuccess(DetailBean mData);

    void getDetailError(String msg);
}
