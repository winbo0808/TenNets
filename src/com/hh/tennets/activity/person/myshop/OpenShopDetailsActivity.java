package com.hh.tennets.activity.person.myshop;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.ab.view.ioc.AbIocView;
import com.ab.view.sliding.AbBottomTabView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

public class OpenShopDetailsActivity extends BaseActivity implements
		OnClickListener {

	@AbIocView(id = R.id.btn_open_shop)
	private Button btn_open_shop;

	@Override
	public void onClick(View v) {
		// TODO 自动生成的方法存根
		if (v == btn_open_shop) {
			Intent intent = new Intent(mContext,
					OpenShopAgreementActivity.class);
			mContext.startActivity(intent);
		}
	}

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.activity_open_shop_details;
	}

	@Override
	public void initHolder() {
		setSubPageTitle("开店详情", true);
	}

	@Override
	public void initLayoutParams() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerClickLister() {
		// TODO Auto-generated method stub
		btn_open_shop.setOnClickListener(this);
		// layout_shop_order_tab.setOnClickListener(this);
		// layout_shop_news_tab.setOnClickListener(this);
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub
	}

}
