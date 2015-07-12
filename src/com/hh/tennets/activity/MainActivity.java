package com.hh.tennets.activity;

import android.annotation.TargetApi;
import android.app.FragmentTransaction;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.fragment.ChooseBuyFragment;
import com.hh.tennets.fragment.HomePageFragment;
import com.hh.tennets.fragment.PersonCenterFragment;
import com.hh.tennets.fragment.ShoppingCartFragment;

public class MainActivity extends BaseActivity implements OnClickListener {
	@AbIocView(id = R.id.homepage_ll)
	private LinearLayout homepageLayout;
	@AbIocView(id = R.id.iv_homepage)
	private ImageView iv_homepage;
	@AbIocView(id = R.id.tv_homepage)
	private TextView tv_homepage;

	@AbIocView(id = R.id.choosebuy_ll)
	private LinearLayout choosebuyLayout;
	@AbIocView(id = R.id.iv_choosebuy)
	private ImageView iv_choosebuy;
	@AbIocView(id = R.id.tv_choosebuy)
	private TextView tv_choosebuy;

	@AbIocView(id = R.id.shoppingcart_ll)
	private LinearLayout shoppingcartLayout;
	@AbIocView(id = R.id.iv_shoppingcart)
	private ImageView iv_shoppingcart;
	@AbIocView(id = R.id.tv_shoppingcart)
	private TextView tv_shoppingcart;

	@AbIocView(id = R.id.person_ll)
	private LinearLayout personcenterLayout;
	@AbIocView(id = R.id.iv_person)
	private ImageView iv_person;
	@AbIocView(id = R.id.tv_person)
	private TextView tv_person;

	private HomePageFragment homePageFragment;
	private ChooseBuyFragment chooseBuyFragment;
	private ShoppingCartFragment shoppingCartFragment;
	private PersonCenterFragment personCenterFragment;
	private FragmentTransaction transaction;

	@Override
	public int getLayoutId() {
		return R.layout.activity_main;
	}

	@Override
	public void initHolder() {
		setSubPageTitle("奶酪时光", true);
		initFragments();
	}

	@Override
	public void initLayoutParams() {
	}

	@Override
	public void registerClickLister() {
		homepageLayout.setOnClickListener(this);
		choosebuyLayout.setOnClickListener(this);
		shoppingcartLayout.setOnClickListener(this);
		personcenterLayout.setOnClickListener(this);
	}

	@Override
	public void initData() {
	}

	private void initFragments() {
		homePageFragment = new HomePageFragment();
		chooseBuyFragment = new ChooseBuyFragment();
		shoppingCartFragment = new ShoppingCartFragment();
		personCenterFragment = new PersonCenterFragment();
		showFragement(1);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.homepage_ll:
			showFragement(1);
			break;
		case R.id.choosebuy_ll:
			showFragement(2);
			break;
		case R.id.shoppingcart_ll:
			showFragement(3);
			break;
		case R.id.person_ll:
			showFragement(4);
			break;
		default:
			showFragement(1);
			break;
		}
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void showFragement(int page) {
		transaction = getFragmentManager().beginTransaction();
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

		iv_homepage.setImageResource(R.drawable.table_home_page);
		tv_homepage.setTextColor(getResources()
				.getColor(R.color.dark_grey_text));

		iv_choosebuy.setImageResource(R.drawable.table_choose_buy);
		tv_choosebuy.setTextColor(getResources().getColor(
				R.color.dark_grey_text));

		iv_shoppingcart.setImageResource(R.drawable.table_shopping_cart);
		tv_shoppingcart.setTextColor(getResources().getColor(
				R.color.dark_grey_text));

		iv_person.setImageResource(R.drawable.icon_phone_logo);
		tv_person.setTextColor(getResources().getColor(R.color.dark_grey_text));

		switch (page) {
		case 1:
			iv_homepage.setImageResource(R.drawable.icon_home_select);
			tv_homepage
					.setTextColor(getResources().getColor(R.color.blue_text));
			transaction.replace(R.id.main_frame, homePageFragment);
			break;
		case 2:
			iv_choosebuy.setImageResource(R.drawable.icon_choosebuy_select);
			tv_choosebuy.setTextColor(getResources()
					.getColor(R.color.blue_text));
			transaction.replace(R.id.main_frame, chooseBuyFragment);
			break;
		case 3:

			iv_shoppingcart
					.setImageResource(R.drawable.icon_shopingcart_select);
			tv_shoppingcart.setTextColor(getResources().getColor(
					R.color.blue_text));
			transaction.replace(R.id.main_frame, shoppingCartFragment);
			break;
		case 4:
			iv_person.setImageResource(R.drawable.table_person_center);
			tv_person.setTextColor(getResources().getColor(R.color.blue_text));
			transaction.replace(R.id.main_frame, personCenterFragment);
			break;
		}
		transaction.commitAllowingStateLoss();
	}
}
