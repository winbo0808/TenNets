package com.hh.tennets.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hh.tennets.R;

public class NumberPickerView extends LinearLayout implements OnClickListener {
    private ImageView number_minus_iv;
    private ImageView number_add_iv;
    private TextView number_size_et;
    private int number = 1;

    public NumberPickerView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public NumberPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.number_picker_layout, this);
        init();
    }

    private void init() {
        number_minus_iv = (ImageView) findViewById(R.id.number_minus_iv);
        number_add_iv = (ImageView) findViewById(R.id.number_add_iv);
        number_size_et = (TextView) findViewById(R.id.number_size_et);
        number_minus_iv.setOnClickListener(this);
        number_add_iv.setOnClickListener(this);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.number_minus_iv:
                if (number > 0) {
                    number_size_et.setText(--number + "");
                }
                break;
            case R.id.number_add_iv:
                number_size_et.setText(++number + "");
                break;
            default:
                break;
        }
    }
}
