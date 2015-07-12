package com.hh.tennets.activity.person;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.ab.view.ioc.AbIocView;
import com.ab.view.pullview.AbPullToRefreshView;
import com.ab.view.pullview.AbPullToRefreshView.OnFooterLoadListener;
import com.ab.view.pullview.AbPullToRefreshView.OnHeaderRefreshListener;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.adapter.MyShopCollectListAdapter;

public class ShopCollectedActivity extends BaseActivity implements
		OnClickListener {
	@AbIocView(id = R.id.lv_shop_collected_content)
	private ListView lv_shop_collected_content;
	@AbIocView(id = R.id.pv_shop_collected_content)
	private AbPullToRefreshView mAbPullToRefreshView = null;
	private MyShopCollectListAdapter mAdapter;

	@Override
	public void onClick(View arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.activity_shop_collected;
	}

	@Override
	public void initHolder() {
		// TODO Auto-generated method stub
		setSubPageTitle("店铺收藏", true);
	}

	@Override
	public void initLayoutParams() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerClickLister() {
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
	}

	@Override
	public void initData() {
		mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAdapter = new MyShopCollectListAdapter(mContext);
		lv_shop_collected_content.setAdapter(mAdapter);
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
