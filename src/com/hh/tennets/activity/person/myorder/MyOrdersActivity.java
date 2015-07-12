package com.hh.tennets.activity.person.myorder;

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

public class MyOrdersActivity extends BaseActivity implements OnClickListener {
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
		setSubPageTitle("我的订单", true);
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
		mAbSlidingTabView.getViewPager().setOffscreenPageLimit(3);
		MyOrdersItemFragmentLoad page1 = new MyOrdersItemFragmentLoad(0);
		MyOrdersItemFragmentLoad page2 = new MyOrdersItemFragmentLoad(1);
		MyOrdersItemFragmentLoad page3 = new MyOrdersItemFragmentLoad(2);
		List<Fragment> mFragments = new ArrayList<Fragment>();
		mFragments.add(page1);
		mFragments.add(page2);
		mFragments.add(page3);

		List<String> tabTexts = new ArrayList<String>();
		tabTexts.add("未付款订单");
		tabTexts.add("已付款订单");
		tabTexts.add("待退款订单");

		// 设置样式
		mAbSlidingTabView.setTabTextColor(mContext.getResources().getColor(
				R.color.black_text));
		mAbSlidingTabView.setTabSelectColor(mContext.getResources().getColor(
				R.color.blue_text));
		mAbSlidingTabView.setTabBackgroundResource(R.drawable.tab_bg);
		mAbSlidingTabView.setTabLayoutBackgroundResource(R.drawable.gray_bg);
		mAbSlidingTabView.setTabTextSize(35);
		// 演示增加一组
		mAbSlidingTabView.addItemViews(tabTexts, mFragments);
		mAbSlidingTabView.setTabPadding(20,
				(int) AbViewUtil.dip2px(mContext, 8), 20,
				(int) AbViewUtil.dip2px(mContext, 8));
	}

}
