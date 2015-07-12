package com.hh.tennets.adapter;

import java.util.List;
import java.util.Map;

import com.hh.tennets.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyShopCollectListAdapter extends BaseAdapter {
	private Context mContext;
	private List<Map<String, String>> list;
	private LayoutInflater inflater;

	public MyShopCollectListAdapter(Context mContext) {
		super();
		this.mContext = mContext;
		// this.list = list;
		inflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		return 9;
	}

	@Override
	public Object getItem(int arg0) {
		return "D9999000";
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(
					R.layout.lv_shop_collected_list_item, null);
			holder.iv_content_value1 = (ImageView) convertView
					.findViewById(R.id.iv_content_value1);
			holder.tv_content_value1 = (TextView) convertView
					.findViewById(R.id.tv_content_value1);
			holder.tv_content_value2 = (TextView) convertView
					.findViewById(R.id.tv_content_value2);
			holder.tv_content_value3 = (TextView) convertView
					.findViewById(R.id.tv_content_value3);
			holder.tv_content_value4 = (TextView) convertView
					.findViewById(R.id.tv_content_value4);
			holder.tv_content_value5 = (TextView) convertView
					.findViewById(R.id.tv_content_value5);
			holder.tv_content_value6 = (TextView) convertView
					.findViewById(R.id.tv_content_value6);
			holder.tv_content_value7 = (TextView) convertView
					.findViewById(R.id.tv_content_value7);
			holder.tv_content_value8 = (TextView) convertView
					.findViewById(R.id.tv_content_value8);
			holder.tv_content_value9 = (TextView) convertView
					.findViewById(R.id.tv_content_value9);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		return convertView;
	}

	class ViewHolder {
		ImageView iv_content_value1;
		TextView tv_content_value1;
		TextView tv_content_value2;
		TextView tv_content_value3;
		TextView tv_content_value4;
		TextView tv_content_value5;
		TextView tv_content_value6;
		TextView tv_content_value7;
		TextView tv_content_value8;
		TextView tv_content_value9;
	}
}
