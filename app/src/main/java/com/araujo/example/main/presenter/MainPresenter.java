package com.araujo.example.main.presenter;

import com.araujo.example.interactor.IMainInteractor;
import com.araujo.example.interactor.InteractorMessage;
import com.araujo.example.main.view.IMainView;
import com.araujo.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by jorge.araujo on 1/2/2016.
 */
public class MainPresenter extends BasePresenter<IMainView> implements IMainPresenter {

    @Inject IMainInteractor mMainInteractor;

    @Override
    public void onResume() {
        mMainInteractor.retrieveIp();
    }

    public void onEvent(InteractorMessage.IpMessage ipMessage) {
        getView().setIpText(ipMessage.getObject().getIp());
    }

}
