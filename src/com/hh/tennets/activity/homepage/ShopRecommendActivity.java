package com.hh.tennets.activity.homepage;

import android.widget.ListView;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.adapter.ShopRecommendListAdapter;

public class ShopRecommendActivity extends BaseActivity {
    private static final String TAG = "ShopRecommendActivity";
    @AbIocView(id = R.id.shop_recommend_lv)
    private ListView shop_recommend_lv;
    private ShopRecommendListAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_shop_recommend;
    }

    @Override
    public void initHolder() {
        setSubPageTitle("名店推荐", true);
    }

    @Override
    public void initLayoutParams() {}

    @Override
    public void registerClickLister() {}

    @Override
    public void initData() {
        adapter = new ShopRecommendListAdapter(this, null);
        shop_recommend_lv.setAdapter(adapter);
    }
}
