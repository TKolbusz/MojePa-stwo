package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.mojepastwo.list.SearchController;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ProviderModule.class})
public interface ApplicationComponent {

    SearchController createSearchController();
}
