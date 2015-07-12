package com.hh.tennets.activity.person.myshop;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.ab.view.pullview.AbPullToRefreshView;
import com.ab.view.pullview.AbPullToRefreshView.OnFooterLoadListener;
import com.ab.view.pullview.AbPullToRefreshView.OnHeaderRefreshListener;
import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.adapter.MyShopsNewsItemListAdapter;

public class MyShopsNewsFragment extends BaseFragment {
	private AbPullToRefreshView mAbPullToRefreshView = null;
	private ListView lv_content;
	private MyShopsNewsItemListAdapter mAdapter;

	@Override
	public int getLayoutId() {
		return R.layout.fragment_shops_news;
	}

	@Override
	public void initData() {// 显示内容
		showContentView();
		mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAdapter = new MyShopsNewsItemListAdapter(mActivity);
		lv_content.setAdapter(mAdapter);
	}

	@Override
	public void initHolder(View view) {
		setSubPageTitle("订单", true);
		lv_content = (ListView) view.findViewById(R.id.lv_content);
		mAbPullToRefreshView = (AbPullToRefreshView) view
				.findViewById(R.id.mPullRefreshView);
	}

	@Override
	public void bindListener() {
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
				// TODO 自动生成的方法存根
				startMyActivity(MyShopNewsDetailsActivity.class);
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
