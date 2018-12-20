package com.tkolbusz.data.repository;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanyLayer;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.repository.CompanyRepository;
import com.tkolbusz.provider.IProviderService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;

import static com.tkolbusz.domain.Config.REST_PAGE_SIZE;

public class CompanyRepositoryImpl implements CompanyRepository {
    private final IProviderService providerService;
    private final Map<Integer, Company> companyDetailsCache;

    @Inject
    public CompanyRepositoryImpl(IProviderService providerService) {
        this.providerService = providerService;
        this.companyDetailsCache = new ConcurrentHashMap<>();
    }

    @Override
    public List<CompanySmall> getCompanies(String query, int page) throws ConnectionException, ProviderException {
        return providerService.searchCompanies(query, page, REST_PAGE_SIZE);
    }

    @Override
    public Company getCompanyById(int externalId) throws ConnectionException, ProviderException {
        Company cachedCompany = companyDetailsCache.get(externalId);
        if (cachedCompany != null) return cachedCompany;
        else {
            Company company = providerService.getCompanyById(externalId, Arrays.asList(CompanyLayer.REPRESENTATION, CompanyLayer.SHAREHOLDERS));
            companyDetailsCache.put(externalId, company);
            return company;
        }
    }
}