package com.tkolbusz.data.repository;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.repository.CompanyRepository;
import com.tkolbusz.provider.IProviderService;

import java.util.List;

import javax.inject.Inject;

import static com.tkolbusz.domain.Config.REST_PAGE_SIZE;

public class CompanyRepositoryImpl implements CompanyRepository {
    private final IProviderService providerService;

    @Inject
    public CompanyRepositoryImpl(IProviderService providerService) {
        this.providerService = providerService;
    }

    @Override
    public List<Company> getCompanies(String query, int page) throws ConnectionException, ProviderException {
        return providerService.searchCompanies(query, page, REST_PAGE_SIZE);
    }
}
