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

public class MyReleaseActivity extends BaseActivity implements OnClickListener {
	private Context mContext;
	private AbSlidingTabView mAbSlidingTabView;

	@Override
	public void onClick(View arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.activity_my_orders;
	}

	@Override
	public void initHolder() {
		// TODO Auto-generated method stub
		mContext = this;
		setSubPageTitle("我的发布", true);
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
		// TODO Auto-generated method stub
		mAbSlidingTabView.getViewPager().setOffscreenPageLimit(2);
		MyReleaseItemFragmentLoad page1 = new MyReleaseItemFragmentLoad(0);
		MyReleaseItemFragmentLoad page2 = new MyReleaseItemFragmentLoad(1);
		List<Fragment> mFragments = new ArrayList<Fragment>();
		mFragments.add(page1);
		mFragments.add(page2);

		List<String> tabTexts = new ArrayList<String>();
		tabTexts.add("二手发布记录");
		tabTexts.add("招聘发布记录");

		// 设置样式
		mAbSlidingTabView.setTabTextColor(mContext.getResources().getColor(
				R.color.black_text));
		mAbSlidingTabView.setTabSelectColor(mContext.getResources().getColor(
				R.color.blue_text));
		mAbSlidingTabView.setTabBackgroundResource(R.drawable.tab_bg);
		mAbSlidingTabView.setTabLayoutBackgroundResource(R.drawable.gray_bg);
		mAbSlidingTabView.setTabTextSize(35);
		// 演示增加一组a
		mAbSlidingTabView.addItemViews(tabTexts, mFragments);
		mAbSlidingTabView.setTabPadding(20,
				(int) AbViewUtil.dip2px(mContext, 8), 20,
				(int) AbViewUtil.dip2px(mContext, 8));
	}

}
