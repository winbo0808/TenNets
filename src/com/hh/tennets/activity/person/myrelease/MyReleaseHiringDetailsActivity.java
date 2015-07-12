package com.hh.tennets.activity.person.myrelease;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.ab.util.AbViewUtil;
import com.ab.view.ioc.AbIocView;
import com.ab.view.sliding.AbSlidingTabView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

public class MyReleaseHiringDetailsActivity extends BaseActivity implements
		OnClickListener {
	private Context mContext;
	private AbSlidingTabView mAbSlidingTabView;

	@Override
	public void onClick(View arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.activity_my_release_hiring_details;
	}

	@Override
	public void initHolder() {
		// TODO Auto-generated method stub
		mContext = this;
		setSubPageTitle("发布招聘详情", true);
		mAbSlidingTabView = (AbSlidingTabView) findViewById(R.id.mAbSlidingTabView);
	}

	@Override
	public void initLayoutParams() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerClickLister() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initData() {
	}

}
