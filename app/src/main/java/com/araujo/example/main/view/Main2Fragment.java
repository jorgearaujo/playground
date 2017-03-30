package com.araujo.example.main.view;

import com.araujo.example.main.presenter.IMainPresenter;
import com.araujo.mvp.BaseFragment;

/**
 * Created by jorge.araujo on 1/1/2016.
 */
public class Main2Fragment extends BaseFragment<Main2ViewHolder, IMainPresenter> implements IMainView {

    @Override
    public void setIpText(String text) {
        getViewHolder().ipTextView.setText(text);
    }

}
