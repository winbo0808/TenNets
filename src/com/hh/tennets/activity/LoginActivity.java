package com.hh.tennets.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

public class LoginActivity extends BaseActivity implements OnClickListener {
	@AbIocView(id = R.id.btn_register)
	private Button btn_register;
	@AbIocView(id = R.id.btn_change_pwd)
	private Button btn_change_pwd;
	@AbIocView(id = R.id.btn_login_login)
	private Button btn_login;

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login_login:
			Intent mainIntent = new Intent(LoginActivity.this,
					MainActivity.class);
			startActivity(mainIntent);
			break;
		case R.id.btn_register:
			// Intent registerIntent = new Intent(LoginActivity.this,
			// RegisterActivity.class);
			// startActivity(registerIntent);
			 Intent registerIntent = new Intent(LoginActivity.this,
			 SearchActivity.class);
			 startActivity(registerIntent);
			break;
		case R.id.btn_change_pwd:
			Intent forgetpwdIntent = new Intent(LoginActivity.this,
					ForgetPwdActivity.class);
			startActivity(forgetpwdIntent);
			break;

		default:
			break;
		}
	}

	@Override
	public int getLayoutId() {
		return R.layout.activity_login;
	}

	@Override
	public void initHolder() {
		setSubPageTitle("登录", true);

	}

	@Override
	public void initLayoutParams() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void registerClickLister() {
		// TODO 自动生成的方法存根
		btn_register.setOnClickListener(this);
		btn_change_pwd.setOnClickListener(this);
		btn_login.setOnClickListener(this);
	}

	@Override
	public void initData() {
		// TODO 自动生成的方法存根

	}

}
