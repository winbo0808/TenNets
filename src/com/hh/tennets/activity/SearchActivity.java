package com.hh.tennets.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.TextView;

import com.ab.util.AbViewUtil;
import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.view.FlowLayout;

public class SearchActivity extends BaseActivity implements OnClickListener {
	@AbIocView(id = R.id.shop_hot_flowlayout)
	private FlowLayout shop_hot_flowlayout;

	@AbIocView(id = R.id.flea_hot_flowlayout)
	private FlowLayout flea_hot_flowlayout;
	@AbIocView(id = R.id.job_hot_flowlayout)
	private FlowLayout job_hot_flowlayout;
	private String[] shopHotStrs = { "外卖", "旧书", "印刷打印", "美容养生", "美食点心",
			"电脑配件", "手机贴膜" };
	private String[] fleaHotStrs = { "乐器", "健身器材", "手机配件", "苹果电脑", "二手手机",
			"二手家具" };
	private String[] jobHotStrs = { "销售", "IT行业", "会计", "android软件工程师",
			"IOS软件工程师", "行政管理" };

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// case R.id.btn_login_login:
		// Intent mainIntent = new Intent(SearchActivity.this,
		// MainActivity.class);
		// startActivity(mainIntent);
		// break;
		// case R.id.btn_register:
		// Intent registerIntent = new Intent(SearchActivity.this,
		// RegisterActivity.class);
		// startActivity(registerIntent);
		// break;
		// case R.id.btn_change_pwd:
		// Intent forgetpwdIntent = new Intent(SearchActivity.this,
		// ForgetPwdActivity.class);
		// startActivity(forgetpwdIntent);
		// break;

		default:
			break;
		}
	}

	@Override
	public int getLayoutId() {
		return R.layout.activity_search;
	}

	@Override
	public void initHolder() {

	}

	@Override
	public void initLayoutParams() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void registerClickLister() {
		// TODO 自动生成的方法存根
		// btn_register.setOnClickListener(this);
		// btn_change_pwd.setOnClickListener(this);
		// btn_login.setOnClickListener(this);
	}

	@Override
	public void initData() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < shopHotStrs.length; i++) {
			TextView button = new TextView(mContext);
			button.setBackgroundResource(R.drawable.common_flowlayout_item_bg);
			button.setText(shopHotStrs[i].toString());
			MarginLayoutParams params = new MarginLayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			params.leftMargin = (int) AbViewUtil.dip2px(mContext, 5);
			params.topMargin = (int) AbViewUtil.dip2px(mContext, 5);
			shop_hot_flowlayout.addView(button, params);
		}
		for (int i = 0; i < fleaHotStrs.length; i++) {
			TextView button = new TextView(mContext);
			button.setBackgroundResource(R.drawable.common_flowlayout_item_bg);
			button.setText(fleaHotStrs[i].toString());
			MarginLayoutParams params = new MarginLayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			params.leftMargin = (int) AbViewUtil.dip2px(mContext, 5);
			params.topMargin = (int) AbViewUtil.dip2px(mContext, 5);
			flea_hot_flowlayout.addView(button, params);
		}
		for (int i = 0; i < jobHotStrs.length; i++) {
			TextView button = new TextView(mContext);
			button.setBackgroundResource(R.drawable.common_flowlayout_item_bg);
			button.setText(jobHotStrs[i].toString());
			MarginLayoutParams params = new MarginLayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			params.leftMargin = (int) AbViewUtil.dip2px(mContext, 5);
			params.topMargin = (int) AbViewUtil.dip2px(mContext, 5);
			job_hot_flowlayout.addView(button, params);
		}
	}
}
