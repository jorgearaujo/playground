package com.araujo.example;

import com.orm.SugarApp;
import com.squareup.leakcanary.LeakCanary;

import io.araujo.androidhttp.webservice.request.volley.AndroidHttp;

/**
 * Created by jorge.araujo on 1/2/2016.
 */
public class Application extends SugarApp {

	@Override
	public void onCreate() {
		super.onCreate();
		AndroidHttp.init(this, null, null);
		new BindingConfiguration().configure();
		LeakCanary.install(this);
	}
}
