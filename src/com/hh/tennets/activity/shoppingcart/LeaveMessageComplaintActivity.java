package com.hh.tennets.activity.shoppingcart;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

/**
 * 留言投诉
 */
public class LeaveMessageComplaintActivity extends BaseActivity implements OnClickListener {
    private static final String TAG = "LeaveMessageComplaint";
    @AbIocView(id = R.id.btn_make_sure_complaint)
    private Button btn_make_sure_complaint;

    @Override
    public int getLayoutId() {
        return R.layout.activity_leave_message_complaint;
    }

    @Override
    public void initHolder() {
        setSubPageTitle("留言投诉", true);
    }

    @Override
    public void initLayoutParams() {}

    @Override
    public void registerClickLister() {
        btn_make_sure_complaint.setOnClickListener(this);
    }

    @Override
    public void initData() {}

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_make_sure_complaint:
                Intent intent =
                        new Intent(LeaveMessageComplaintActivity.this,
                                ComplaintSuccessActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
