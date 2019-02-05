package com.tkolbusz.mojepanstwo.di;

import com.tkolbusz.provider.IProviderService;
import com.tkolbusz.provider.ProviderServiceFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {
    @Singleton
    @Provides
    IProviderService providerService() {
        return ProviderServiceFactory.getProviderService();
    }
}
