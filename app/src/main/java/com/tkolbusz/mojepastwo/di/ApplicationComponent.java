package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.mojepastwo.search.SearchController;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ProviderModule.class})
public interface ApplicationComponent {

    SearchController createSearchController();
}
