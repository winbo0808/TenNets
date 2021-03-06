package com.hh.tennets.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.activity.homepage.ShopRecommendActivity;
import com.hh.tennets.adapter.HomePageCommentListAdapter;
import com.hh.tennets.view.MyListView;

public class HomePageFragment extends BaseFragment {
    private static final String TAG = "HomePageFragment";
    private MyListView commentListView;
    private ImageView fragment_home_page_large_iv;
    private HomePageCommentListAdapter adapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_homepage;
    }

    @SuppressLint("NewApi")
    @Override
    public void initData() {// 显示内容
        showContentView();
        adapter = new HomePageCommentListAdapter(getActivity(), null);
        commentListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void initHolder(View view) {
        setSubPageTitle("奶酪时光", false);
        commentListView = (MyListView) view.findViewById(R.id.fragment_home_comment_lv);
        fragment_home_page_large_iv =
                (ImageView) view.findViewById(R.id.fragment_home_page_large_iv);
    }

    @SuppressLint("NewApi")
    @Override
    public void bindListener() {
        fragment_home_page_large_iv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ShopRecommendActivity.class);
                getActivity().startActivity(intent);
            }
        });
    }
}
