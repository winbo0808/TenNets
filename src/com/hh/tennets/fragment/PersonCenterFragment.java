package com.hh.tennets.fragment;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.activity.person.MyCouponsActivity;
import com.hh.tennets.activity.person.ShopCollectedActivity;
import com.hh.tennets.activity.person.myorder.MyOrdersActivity;
import com.hh.tennets.activity.person.myrelease.MyReleaseActivity;
import com.hh.tennets.activity.person.myshop.MyShopsActivity;

public class PersonCenterFragment extends BaseFragment implements
		OnClickListener {
	private LinearLayout layout_persoon_center_item1;
	private LinearLayout layout_persoon_center_item2;
	private LinearLayout layout_persoon_center_item3;
	private LinearLayout layout_persoon_center_item4;
	private LinearLayout layout_persoon_center_item5;
	private LinearLayout layout_persoon_center_item6;
	private LinearLayout layout_my_order;
	private LinearLayout layout_my_shop;

	private LinearLayout layout_my_release;

	@Override
	public void onClick(View v) {
		if (v == layout_persoon_center_item1) {
			startMyActivity(MyOrdersActivity.class);
		} else if (v == layout_persoon_center_item2) {
			startMyActivity(MyShopsActivity.class);
		} else if (v == layout_persoon_center_item3) {
			startMyActivity(MyReleaseActivity.class);
		} else if (v == layout_persoon_center_item4) {
			startMyActivity(MyCouponsActivity.class);
		} else if (v == layout_persoon_center_item5) {
			startMyActivity(ShopCollectedActivity.class);
		} else if (v == layout_persoon_center_item6) {
			// startMyActivity(MyOrdersActivity.class);
		}
		// if (v == layout_my_order) {
		// Intent intent = new Intent(mActivity, MyOrdersActivity.class);
		// mActivity.startActivity(intent);
		// } else if (v == layout_my_shop) {
		// // Intent intent = new Intent(mContext, MyOrdersActivity.class);
		// // mContext.startActivity(intent);
		// } else if (v == layout_my_release) {
		// Intent intent = new Intent(mActivity, MyReleaseActivity.class);
		// mActivity.startActivity(intent);
		// }
	}

	@Override
	public int getLayoutId() {
		return R.layout.fragment_personcenter;
	}

	@Override
	public void initHolder(View view) {
		setSubPageTitle("个人中心", false);
		layout_persoon_center_item1 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item1);
		layout_persoon_center_item2 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item2);
		layout_persoon_center_item3 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item3);
		layout_persoon_center_item4 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item4);
		layout_persoon_center_item5 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item5);
		layout_persoon_center_item6 = (LinearLayout) view
				.findViewById(R.id.layout_persoon_center_item6);

		layout_my_order = (LinearLayout) view
				.findViewById(R.id.layout_my_order);
		layout_my_shop = (LinearLayout) view.findViewById(R.id.layout_my_shop);
		layout_my_release = (LinearLayout) view
				.findViewById(R.id.layout_my_release);
	}

	@Override
	public void initData() {
		// 显示内容
		showContentView();
	}

	@Override
	public void bindListener() {
		layout_persoon_center_item1.setOnClickListener(this);
		layout_persoon_center_item2.setOnClickListener(this);
		layout_persoon_center_item3.setOnClickListener(this);
		layout_persoon_center_item4.setOnClickListener(this);
		layout_persoon_center_item5.setOnClickListener(this);
		layout_persoon_center_item6.setOnClickListener(this);
		layout_my_order.setOnClickListener(this);
		layout_my_shop.setOnClickListener(this);
		layout_my_release.setOnClickListener(this);
	}
}
