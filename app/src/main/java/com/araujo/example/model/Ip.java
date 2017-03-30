package com.araujo.example.model;

import com.orm.SugarRecord;

import io.araujo.androidhttp.database.PersistentObject;

/**
 * Created by jorge.araujo on 3/30/2017.
 */

public class Ip extends PersistentObject {

	private String ip;

	public String getIp() {
		return ip;
	}
}
