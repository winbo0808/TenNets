package com.hh.tennets.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.activity.choosebuy.TimeLimitBuyActivity;
import com.hh.tennets.activity.shoppingcart.SubmitOrderStateActivity;

@SuppressLint("NewApi")
public class ShoppingCartFragment extends BaseFragment {
    private static final String TAG = "ShoppingCartFragment";
    private Button fragment_submit_order_btn;
    private ImageView fragment_submit_order_iv;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_shoppingcart;
    }

    @Override
    public void initData() {// 显示内容
        showContentView();
    }

    @Override
    public void initHolder(View view) {
        setSubPageTitle("奶酪时光", false);
        fragment_submit_order_btn = (Button) view.findViewById(R.id.fragment_submit_order_btn);
        fragment_submit_order_iv = (ImageView) view.findViewById(R.id.fragment_submit_order_iv);
        fragment_submit_order_btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SubmitOrderStateActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }

    @Override
    public void bindListener() {
        fragment_submit_order_iv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TimeLimitBuyActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }
}
