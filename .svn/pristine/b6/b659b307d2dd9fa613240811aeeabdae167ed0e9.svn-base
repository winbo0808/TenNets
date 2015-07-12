package com.hh.tennets.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ab.db.orm.annotation.Id;
import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

public class ForgetPwdActivity extends BaseActivity implements OnClickListener {
	@AbIocView(id = R.id.btn_register)
	private Button btn_register;

	@Override
	public void onClick(View v) {
		// TODO 自动生成的方法存根
		if (v == btn_register) {
			Intent intent = new Intent(ForgetPwdActivity.this,
					RegisterActivity.class);
			startActivity(intent);
		}
	}

	@Override
	public int getLayoutId() {
		// TODO 自动生成的方法存根
		return R.layout.activity_forget_pwd;
	}

	@Override
	public void initHolder() {
		setSubPageTitle("忘记密码", true);

	}

	@Override
	public void initLayoutParams() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void registerClickLister() {
		// TODO 自动生成的方法存根
		btn_register.setOnClickListener(this);

	}

	@Override
	public void initData() {
		// TODO 自动生成的方法存根

	}

}
