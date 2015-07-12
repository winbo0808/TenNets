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

public class MyShopsNewsItemListAdapter extends BaseAdapter {
	private Context mContext;
	private List<Map<String, String>> list;
	private LayoutInflater inflater;

	public MyShopsNewsItemListAdapter(Context mContext) {
		super();
		this.mContext = mContext;
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
					R.layout.lv_my_shops_news_item_list_item, null);
			holder.iv_news_item_content1 = (ImageView) convertView
					.findViewById(R.id.iv_news_item_content1);
			holder.tv_news_item_content2 = (TextView) convertView
					.findViewById(R.id.tv_news_item_content2);
			holder.tv_news_item_content3 = (TextView) convertView
					.findViewById(R.id.tv_news_item_content3);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		return convertView;
	}

	class ViewHolder {
		ImageView iv_news_item_content1;
		TextView tv_news_item_content2;
		TextView tv_news_item_content3;
	}
}
