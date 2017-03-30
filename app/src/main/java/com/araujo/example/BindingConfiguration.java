package com.araujo.example;

import com.araujo.example.interactor.IMainInteractor;
import com.araujo.example.interactor.MainInteractor;
import com.araujo.example.main.presenter.IMainPresenter;
import com.araujo.example.main.presenter.MainPresenter;
import com.araujo.example.main.view.IMainView;
import com.araujo.example.main.view.Main2Fragment;
import com.araujo.example.main.view.MainFragment;
import com.araujo.example.service.TestService;
import com.araujo.example.service.TestServiceProvider;

/**
 * Created by jorge.araujo on 1/24/2016.
 */
public class BindingConfiguration extends com.araujo.lightinject.di.BindingConfiguration {

	@Override
	public void configure() {
		from(IMainView.class).to(MainFragment.class).add();
//		from(IMainView.class).to(Main2Fragment.class).add();
		from(IMainPresenter.class).to(MainPresenter.class).add();
		from(IMainInteractor.class).to(MainInteractor.class).singleton().add();
		from(TestService.class).provider(TestServiceProvider.class).singleton().add();
	}
}
