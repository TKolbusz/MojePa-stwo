package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.provider.ProviderService;
import com.tkolbusz.provider.ProviderServiceFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {
    @Singleton
    @Provides
    ProviderService providerService() {
        return ProviderServiceFactory.getProviderService();
    }
}
