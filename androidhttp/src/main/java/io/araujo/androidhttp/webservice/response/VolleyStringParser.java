package io.araujo.androidhttp.webservice.response;

import java.lang.reflect.Type;

import io.araujo.androidhttp.webservice.request.volley.request.VolleyRequest;

public class VolleyStringParser<T> implements VolleyParser<T> {
	public T parse(VolleyRequest<T> request, String response) {
		return (T) response;
	}

    @Override
    public T parse(String response, boolean isList, Type typeToken, Class clazz) {
        return null;
    }
}
