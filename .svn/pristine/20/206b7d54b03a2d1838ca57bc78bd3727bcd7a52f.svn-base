package com.hh.tennets;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ab.activity.AbActivity;
import com.ab.util.AbDialogUtil;
import com.ab.util.AbToastUtil;

public abstract class BaseActivity extends AbActivity {
	protected Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setAbContentView(getLayoutId());
		mContext = this;
		initHolder();
		initLayoutParams();
		registerClickLister();
		initData();
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	/**
	 * 初始化布局
	 */
	public abstract int getLayoutId();

	/**
	 * 初始化控件
	 */
	public abstract void initHolder();

	/**
	 * 初始化布局
	 */
	public abstract void initLayoutParams();

	/**
	 * 注册 控件响应事件
	 */
	public abstract void registerClickLister();

	/**
	 * 初始化数据
	 */
	public abstract void initData();

	/**
	 * 初始化标题栏
	 */
	public void initTitleBar(String title) {
		if (!TextUtils.isEmpty(title)) {
			getTitleBar().setTitleText(title);
		}
	}

	/**
	 * toast提示文本
	 */
	public void showToast(Context context, String text) {
		if (null != context) {
			AbToastUtil.showToast(context, text);
		}
	}

	public void showToast(Context context, int resId) {
		if (null != context) {
			AbToastUtil.showToast(context, resId);
		}
	}

	/**
	 * 在线程中提示文本信息
	 */
	public void showToastInThread(Context context, String text) {
		if (null != context) {
			AbToastUtil.showToastInThread(context, text);
		}
	}

	public void showToastInThread(Context context, int resId) {
		if (null != context) {
			AbToastUtil.showToastInThread(context, resId);
		}
	}

	/**
	 * 显示网络稍后进度框
	 */
	public void showProgressDialog(Context context) {
		if (null != context) {
			AbDialogUtil.showProgressDialog(context, 0, getResources()
					.getResourceName(R.string.progress_dialog));
		}
	}

	/**
	 * 描述：显示进度框.
	 * 
	 * @param context
	 *            the context
	 * @param indeterminateDrawable
	 *            用默认请写0
	 * @param message
	 *            the message
	 */
	public void showProgressDialog(Context context, int indeterminateDrawable,
			String message) {
		if (null != context) {
			AbDialogUtil.showProgressDialog(context, indeterminateDrawable,
					message);
		}
	}

	public void setSubPageTitle(CharSequence title, Boolean isShowBack) {
		TextView tv = ((TextView) findViewById(R.id.tv_common_activity_title));
		tv.setEllipsize(TruncateAt.MARQUEE);
		tv.getPaint().setFakeBoldText(true);// 字体加粗
		if (tv != null) {
			tv.setText(title);
		}
		LinearLayout close = (LinearLayout) findViewById(R.id.layout_common_title_back);
		close.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		if (isShowBack) {
			close.setVisibility(View.VISIBLE);
		} else {

			close.setVisibility(View.INVISIBLE);
		}
	}
}
