package com.hh.tennets.activity.choosebuy;

import android.widget.ListView;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.adapter.TimeLimitBuyAdapter;

public class TimeLimitBuyActivity extends BaseActivity {
    @AbIocView(id = R.id.limit_buy_lv)
    private ListView limit_buy_lv;
    private TimeLimitBuyAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_time_limit_buy;
    }

    @Override
    public void initHolder() {
        setSubPageTitle("限时抢购", true);
    }

    @Override
    public void initLayoutParams() {}

    @Override
    public void registerClickLister() {}

    @Override
    public void initData() {
        adapter = new TimeLimitBuyAdapter(this, null);
        limit_buy_lv.setAdapter(adapter);
    }
}
