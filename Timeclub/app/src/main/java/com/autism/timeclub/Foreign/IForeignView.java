package com.autism.timeclub.Foreign;

import com.autism.timeclub.Foreign.model.RecommonBean;
import com.autism.timelibs.http.IView;

/**
 * Author：autism on 2017/6/13 09:46
 * Used:Timeclub
 */
public interface IForeignView extends IView {

    void recommonResSuccess(RecommonBean recommonBean);

    void getRecommonError(String msg);
}
