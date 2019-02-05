package com.tkolbusz.mojepanstwo.di;

import com.tkolbusz.mojepanstwo.ui.detail.DetailController;
import com.tkolbusz.mojepanstwo.ui.search.SearchController;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ProviderModule.class, RepositoryModule.class, ApplicationModule.class})
public interface ApplicationComponent {

    SearchController createSearchController();

    DetailController createDetailController();
}
