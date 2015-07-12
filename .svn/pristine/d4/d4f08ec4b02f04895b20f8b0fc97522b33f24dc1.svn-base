package com.hh.tennets.activity.person.myshop;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.ab.view.pullview.AbPullToRefreshView;
import com.ab.view.pullview.AbPullToRefreshView.OnFooterLoadListener;
import com.ab.view.pullview.AbPullToRefreshView.OnHeaderRefreshListener;
import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.adapter.MyShopsOrdersItemListAdapter;

public class MyShopsOrdersFragment extends BaseFragment implements
		OnClickListener {
	private ImageButton ibtn_shops_order_refresh;
	private TextView tv_shops_orders_look;
	private AbPullToRefreshView mAbPullToRefreshView = null;
	private ListView lv_content;
	private MyShopsOrdersItemListAdapter mAdapter;

	@Override
	public int getLayoutId() {
		return R.layout.fragment_shops_orders;
	}

	@Override
	public void initData() {
		mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAdapter = new MyShopsOrdersItemListAdapter(mActivity);
		lv_content.setAdapter(mAdapter);
		showContentView();// 显示内容
	}

	@Override
	public void initHolder(View view) {
		ibtn_shops_order_refresh = (ImageButton) view
				.findViewById(R.id.ibtn_shops_order_refresh);
		tv_shops_orders_look = (TextView) view
				.findViewById(R.id.tv_shops_orders_look);
		lv_content = (ListView) view.findViewById(R.id.lv_content);
		mAbPullToRefreshView = (AbPullToRefreshView) view
				.findViewById(R.id.mPullRefreshView);
	}

	@Override
	public void bindListener() {
		lv_content.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO 自动生成的方法存根
				startMyActivity(MyShopOrderDetailsActivity.class);
			}
		});
		ibtn_shops_order_refresh.setOnClickListener(this);
		tv_shops_orders_look.setOnClickListener(this);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v == ibtn_shops_order_refresh) {

		} else if (v == tv_shops_orders_look) {
			startMyActivity(MyShopQueryOrderActivity.class);
		}
	}
}
