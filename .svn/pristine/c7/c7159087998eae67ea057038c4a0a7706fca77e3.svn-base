package com.hh.tennets.activity.person.myshop;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;

public class MyShopsFragment extends BaseFragment implements OnClickListener {
	private LinearLayout layout_shop_title_back;
	private Button btn_shops_setting;
	private Button btn_add_shop;

	@Override
	public int getLayoutId() {
		return R.layout.fragment_shops;
	}

	@Override
	public void initData() {// 显示内容
		showContentView();
	}

	@Override
	public void initHolder(View view) {
		layout_shop_title_back = (LinearLayout) view
				.findViewById(R.id.layout_shop_title_back);
		btn_shops_setting = (Button) view.findViewById(R.id.btn_shops_setting);
		btn_add_shop = (Button) view.findViewById(R.id.btn_add_shop);
	}

	@Override
	public void bindListener() {
		layout_shop_title_back.setOnClickListener(this);
		btn_shops_setting.setOnClickListener(this);
		btn_add_shop.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v == layout_shop_title_back) {
			mActivity.finish();
		} else if (v == btn_shops_setting) {
			startMyActivity(MyShopSettingActivity.class);
		} else if (v == btn_add_shop) {
			startMyActivity(ApplyOpenShopActivity.class);
		}
	}
}
