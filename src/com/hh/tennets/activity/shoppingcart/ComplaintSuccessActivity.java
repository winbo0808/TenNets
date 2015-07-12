package com.hh.tennets.activity.shoppingcart;

import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

/**
 * @className: ComplaintSuccessActivity
 * @description: 投诉成功
 */
public class ComplaintSuccessActivity extends BaseActivity {
    private static final String TAG = "ComplaintSuccessActivity";

    @Override
    public int getLayoutId() {
        return R.layout.activity_complaint_success;
    }

    @Override
    public void initHolder() {
        setSubPageTitle("", true);
    }

    @Override
    public void initLayoutParams() {}

    @Override
    public void registerClickLister() {}

    @Override
    public void initData() {}
}
