package com.autism.timeclub.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.autism.timeclub.R;
import com.autism.timeclub.base.BaseAct;
import com.autism.timelibs.http.IPresenter;

/**
 * Author：autism on 2017/6/16 16:34
 * Used:Timeclub
 */
public class LoginAct extends BaseAct<LoginPre> implements View.OnClickListener, ILoginView {
    private EditText mPhone;
    private EditText mPw;
    private Button mBtnLogin;

    @Override
    protected LoginPre getPresenter() {
        return new LoginPre(this, this);
    }

    @Override
    protected int getRlayoutId() {
        return R.layout.login_act;
    }

    @Override
    protected void initView() {
        super.initView();
        findViewById(R.id.iv_cancel).setOnClickListener(this);
        View mBottomView = findViewById(R.id.rl_bottom);
        measure(mBottomView, 600, 0);
        mPhone = (EditText) findViewById(R.id.et_phone);
        measure(mPhone, 600, 80);
        mPw = (EditText) findViewById(R.id.et_pw);
        measure(mPw, 600, 80);
        mBtnLogin = (Button) findViewById(R.id.bt_login);
        measure(mBtnLogin, 600, 120);
        mBtnLogin.setOnClickListener(this);

        View mThirdContent = findViewById(R.id.ll_third);
        measure(mThirdContent, 600, 0);
        View mApp = findViewById(R.id.ll_app);
        measure(mApp, 600, 0);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.iv_cancel:
                break;
            case R.id.bt_login:
                break;
        }
    }

    @Override
    public void showLoginError(String s) {

    }
}
