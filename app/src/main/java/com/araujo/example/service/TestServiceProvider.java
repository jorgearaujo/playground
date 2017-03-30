package com.araujo.example.service;

import com.araujo.example.interactor.InteractorMessage;
import com.araujo.example.service.TestService;
import com.araujo.lightinject.di.Provider;

import io.araujo.androidhttp.webservice.PersistType;
import io.araujo.androidhttp.webservice.RetrieveFrom;
import io.araujo.androidhttp.webservice.request.PersistMode;

/**
 * Created by jorge.araujo on 2/3/2016.
 */
public class TestServiceProvider implements Provider<TestService> {

	@Override
	public TestService provide() {
		return (TestService) new TestService().event(InteractorMessage.IpMessage.class).persist(PersistType.DATABASE).persistMode(PersistMode.CLEAN)
				.retrieveFrom(RetrieveFrom.AFTER_CALL_ONLY_IF_SERVICE_FAILS);
	}
}
