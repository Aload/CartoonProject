package com.autism.timeclub.home.view;

import com.autism.timeclub.home.model.HotBean;
import com.autism.timelibs.http.IView;

import java.util.List;

/**
 * Author：autism on 2017/6/13 09:27
 * Used:Timeclub
 */
public interface IHomeView extends IView {

    void getHotList(HotBean mList);

    void getHotError(String msg);
}
