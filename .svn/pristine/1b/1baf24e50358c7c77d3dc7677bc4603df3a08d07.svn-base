package com.hh.tennets.adapter;

import java.util.ArrayList;
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

public class FragmentChooseBuyListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Map<String, String>> list = new ArrayList<Map<String, String>>();
    private LayoutInflater inflater;

    public FragmentChooseBuyListAdapter(Context context, List<Map<String, String>> list) {
        super();
//        this.list = list;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public Object getItem(int position) {
        return "D9999000";
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.fragment_choose_buy_adapter_layout, null);
            holder = new ViewHolder();
            holder.foodImageView =
                    (ImageView) convertView.findViewById(R.id.fragment_choose_buy_iv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    class ViewHolder {
        ImageView foodImageView;
        ImageView foodTypeImageView;
        TextView nameTextView;
        TextView sellTextView;
        TextView stockTextView;
        TextView primePriceTextView;
        TextView currentPriceTextView;
        ImageView addImageView;
    }
}
