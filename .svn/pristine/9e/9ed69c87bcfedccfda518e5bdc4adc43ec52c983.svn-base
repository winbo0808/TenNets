package com.hh.tennets.fragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.ab.util.AbDialogUtil;
import com.hh.tennets.BaseFragment;
import com.hh.tennets.R;
import com.hh.tennets.adapter.FragmentChooseBuyListAdapter;
import com.hh.tennets.view.MyListView;

public class ChooseBuyFragment extends BaseFragment {
    private static final String TAG = "ChooseButFragment";
    private MyListView fragment_choosebuy_lv;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_choosebuy;
    }

    @SuppressLint("NewApi")
    @Override
    public void initData() {// 显示内容
        showContentView();
        FragmentChooseBuyListAdapter adapter =
                new FragmentChooseBuyListAdapter(getActivity(), null);
        fragment_choosebuy_lv.setAdapter(adapter);
    }

    @Override
    public void initHolder(View view) {
        setSubPageTitle("奶酪时光", false);
        fragment_choosebuy_lv = (MyListView) view.findViewById(R.id.fragment_choosebuy_lv);
        fragment_choosebuy_lv.setOnItemClickListener(new OnItemClickListener() {

            @SuppressLint("NewApi")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View dialogView =
                        LayoutInflater.from(getActivity())
                                .inflate(R.layout.choose_buy_dialog, null);
                AbDialogUtil.showDialog(dialogView);
            }
        });
    }

    @Override
    public void bindListener() {}
}
