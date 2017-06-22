package com.autism.timeclub.Foreign.view;

import com.autism.timeclub.Foreign.model.FirstBean;
import com.autism.timelibs.http.IView;

/**
 * Author：autism on 2017/6/20 16:54
 * Used:Timeclub
 */
public interface IFirstView extends IView {
    void getContentSuccess(FirstBean mData);

    void getContentError(String msg);
}
