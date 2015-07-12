package com.hh.tennets.adapter;

import java.util.List;
import java.util.Map;

import com.hh.tennets.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyOrdersItemListAdapter extends BaseAdapter {
	private Context mContext;
	private List<Map<String, String>> list;
	private LayoutInflater inflater;
	/**
	 * 记录类型：0未付款1已付款2待退款
	 */
	private int type;

	public MyOrdersItemListAdapter(Context mContext, int type) {
		super();
		this.mContext = mContext;
		this.type = type;
		// this.list = list;
		inflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		// TODO 自动生成的方法存�?
		return 9;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO 自动生成的方法存�?
		return "D9999000";
	}

	@Override
	public long getItemId(int arg0) {
		// TODO 自动生成的方法存�?
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(
					R.layout.lv_my_orders_item_list_item, null);
			holder.tv_my_orders_item_value1 = (TextView) convertView
					.findViewById(R.id.tv_my_orders_item_value1);
			holder.tv_my_orders_item_value2 = (TextView) convertView
					.findViewById(R.id.tv_my_orders_item_value2);
			holder.tv_my_orders_item_value3 = (TextView) convertView
					.findViewById(R.id.tv_my_orders_item_value3);
			holder.tv_my_orders_item_value4 = (TextView) convertView
					.findViewById(R.id.tv_my_orders_item_value4);
			holder.tv_my_orders_item_value5 = (TextView) convertView
					.findViewById(R.id.tv_my_orders_item_value5);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		if (type == 0) {
			holder.tv_my_orders_item_value4.setTextColor(mContext
					.getResources().getColor(R.color.red_text));
		} else {
			holder.tv_my_orders_item_value4.setTextColor(mContext
					.getResources().getColor(R.color.black_text));
		}
		return convertView;
	}

	class ViewHolder {
		TextView tv_my_orders_item_value1;
		TextView tv_my_orders_item_value2;
		TextView tv_my_orders_item_value3;
		TextView tv_my_orders_item_value4;
		TextView tv_my_orders_item_value5;
	}
}
