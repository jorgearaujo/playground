package com.araujo.example.interactor;

import com.araujo.example.service.TestService;

import javax.inject.Inject;

import io.araujo.androidhttp.listener.service.ServiceListener;

/**
 * Created by jorge.araujo on 1/2/2016.
 */
public class MainInteractor implements IMainInteractor {

    @Inject TestService testService;
    @Inject ServiceListener serviceListener;

    @Override
    public void retrieveIp() {
        testService.execute(null, serviceListener);
    }
}
