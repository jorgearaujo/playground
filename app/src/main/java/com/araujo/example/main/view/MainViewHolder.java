package com.araujo.example.main.view;

import com.araujo.example.R;
import com.araujo.mvp.BaseViewHolder;

import android.view.View;
import android.widget.TextView;

/**
 * Created by jorge.araujo on 1/1/2016.
 */
public class MainViewHolder implements BaseViewHolder {

	public TextView ipTextView;

	@Override
	public int getLayout() {
		return R.layout.layout_main;
	}

	@Override
	public void generateViews(View view) {
		ipTextView = (TextView) view.findViewById(R.id.text_hello_world);
	}
}
