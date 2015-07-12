package com.hh.tennets.activity.person.myorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.ab.fragment.AbFragment;
import com.ab.view.pullview.AbPullToRefreshView;
import com.ab.view.pullview.AbPullToRefreshView.OnFooterLoadListener;
import com.ab.view.pullview.AbPullToRefreshView.OnHeaderRefreshListener;
import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.adapter.MyOrdersItemListAdapter;
import com.hh.tennets.adapter.MyReleaseItemListAdapter;

public class MyOrdersItemFragmentLoad extends BaseFragment {
	private AbPullToRefreshView mAbPullToRefreshView = null;
	private ListView lv_content;
	/**
	 * 记录类型：0未付款1已付款2待退款
	 */
	private int type;
	private MyOrdersItemListAdapter mAdapter;

	public MyOrdersItemFragmentLoad(int type) {
		this.type = type;

	}

	@Override
	public void setResource() {
		// 设置加载的资源
		// this.setLoadDrawable(R.drawable.ic_load);
		this.setLoadMessage("正在查询,请稍候");

		// this.setRefreshDrawable(R.drawable.ic_refresh);
		this.setRefreshMessage("请求出错，请重试");
	}

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_my_orders_item;
	}

	@Override
	public void initHolder(View view) {
		// TODO Auto-generated method stub
		lv_content = (ListView) view.findViewById(R.id.lv_content);
		mAbPullToRefreshView = (AbPullToRefreshView) view
				.findViewById(R.id.mPullRefreshView);
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub
		mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAdapter = new MyOrdersItemListAdapter(mActivity, type);
		lv_content.setAdapter(mAdapter);
		// 调这个才可以显示内容
		showContentView();
	}

	@Override
	public void bindListener() {
		// TODO Auto-generated method stub
		// 设置监听器
		mAbPullToRefreshView
				.setOnHeaderRefreshListener(new OnHeaderRefreshListener() {

					@Override
					public void onHeaderRefresh(AbPullToRefreshView view) {
						refreshTask();// 下载数据
					}
				});
		mAbPullToRefreshView
				.setOnFooterLoadListener(new OnFooterLoadListener() {

					@Override
					public void onFooterLoad(AbPullToRefreshView view) {
						loadMoreTask();

					}
				});
		lv_content.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(mActivity,
						MyOrderDetailsActivity.class);
				intent.putExtra("type", type);
				mActivity.startActivity(intent);

			}
		});
	}

	private void refreshTask() {

		// 模拟用，真是开发中需要直接调用run内的内容
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				mAbPullToRefreshView.onHeaderRefreshFinish();
			}

		}, 3000);

	}

	public void loadMoreTask() {
		// 模拟用，真是开发中需要直接调用run内的内容
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				mAbPullToRefreshView.onFooterLoadFinish();
			}

		}, 3000);

	}
}
