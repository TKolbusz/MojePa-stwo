package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.mojepastwo.ui.detail.DetailController;
import com.tkolbusz.mojepastwo.ui.search.SearchController;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ProviderModule.class, RepositoryModule.class, ApplicationModule.class})
public interface ApplicationComponent {

    SearchController createSearchController();

    DetailController createDetailController();
}
