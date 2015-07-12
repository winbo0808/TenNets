package com.hh.tennets;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ab.fragment.AbFragment;
import com.ab.fragment.AbFragment.AbFragmentOnLoadListener;
import com.ab.util.AbDialogUtil;
import com.ab.util.AbToastUtil;

public abstract class BaseFragment extends AbFragment {
	protected Activity mActivity = null;
	private View viewContent;
	private BaseApplication application;

	@Override
	public View onCreateContentView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		mActivity = getActivity();
		application = (BaseApplication) mActivity.getApplication();
		viewContent = inflater.inflate(getLayoutId(), null);
		initHolder(viewContent);
		bindListener();
		// 加载数据必须
		this.setAbFragmentOnLoadListener(new AbFragmentOnLoadListener() {

			@Override
			public void onLoad() {
				// initdata()里调用showContentView()才可以显示内容
				initData();
			}

		});
		return viewContent;
	}

	@Override
	public void setResource() {

		// 设置加载的资源
		// this.setLoadDrawable(R.drawable.ic_load);
		this.setLoadMessage("正在查询,请稍候");

		// this.setRefreshDrawable(R.drawable.ic_refresh);
		this.setRefreshMessage("请求出错，请重试");
	}

	/**
	 * 初始化布局
	 */
	public abstract int getLayoutId();

	public abstract void initHolder(final View view);

	// 第一次下载数据
	public abstract void initData();

	public abstract void bindListener();

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

	public void startMyActivity(Class mcla) {
		Intent intent = new Intent(mActivity, mcla);
		mActivity.startActivity(intent);
	}

	public void setSubPageTitle(CharSequence title, Boolean isShowBack) {
		TextView tv = ((TextView) viewContent
				.findViewById(R.id.tv_common_activity_title));
		tv.setEllipsize(TruncateAt.MARQUEE);
		tv.getPaint().setFakeBoldText(true);// 字体加粗
		if (tv != null) {
			tv.setText(title);
		}
		LinearLayout close = (LinearLayout) viewContent
				.findViewById(R.id.layout_common_title_back);
		if (isShowBack) {
			close.setVisibility(View.VISIBLE);
		} else {

			close.setVisibility(View.INVISIBLE);
		}
		close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mActivity.finish();
			}
		});
	}
}
