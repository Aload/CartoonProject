package com.autism.timeclub.login;

import android.app.Activity;
import android.content.Context;

import com.autism.timelibs.http.BasePresenter;
import com.autism.timelibs.utils.LogicUtils;
import com.autism.timelibs.utils.ToastUtils;
import com.autism.timelibs.utils.ViewUtil;

/**
 * Author：autism on 2017/6/16 16:35
 * Used:Timeclub
 */
public class LoginPre extends BasePresenter<ILoginView> {
    public LoginPre(Activity activity, ILoginView view) {
        super(activity, view);
    }

    @Override
    public void attachView() {

    }

    /**
     * 登录判定
     *
     * @param mContext
     * @param phone
     * @param pw
     */
    public void login(Context mContext, String phone, String pw) {
        if (ViewUtil.isNullOrEmpty(phone) || ViewUtil.isNullOrEmpty(pw)) {
            ToastUtils.showToast(mContext, "用户名/密码不能为空!");
            mView.showLoginError("用户名/密码不能为空!");
            return;
        }
        if (LogicUtils.isMobileNumber(phone.trim())) {
            ToastUtils.showToast(mContext, "请填写有效的手机号码!");
            mView.showLoginError("请填写有效的手机号码!");
            return;
        }
    }
}
