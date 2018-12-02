package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.data.repository.CompanyRepositoryImpl;
import com.tkolbusz.domain.repository.CompanyRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract CompanyRepository companyRepository(CompanyRepositoryImpl impl);

}
