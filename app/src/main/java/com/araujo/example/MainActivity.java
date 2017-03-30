package com.araujo.example;

import com.araujo.example.main.view.IMainView;
import com.araujo.example.main.view.MainFragment;
import com.araujo.mvp.BaseActivity;
import com.araujo.mvp.OneFragmentActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

// This activity just redirects to the main fragment
public class MainActivity extends BaseActivity {

    @Inject IMainView mMainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneFragmentActivity.startActivity(this, mMainView.getClass());
        finish();
    }

}
