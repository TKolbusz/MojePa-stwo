package com.tkolbusz.data.repository;

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

import io.reactivex.Maybe;
import io.reactivex.Single;

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
    public Single<List<CompanySmall>> getCompanies(String query, int page) {
        return providerService.searchCompanies(query, page, REST_PAGE_SIZE);
    }

    @Override
    public Single<Company> getCompanyById(int externalId) {
        Maybe<Company> cachedValue = Maybe.create(emitter -> {
            Company cachedCompany = companyDetailsCache.get(externalId);
            if (cachedCompany != null) emitter.onSuccess(cachedCompany);
            emitter.onComplete();
        });

        Single<Company> downloadData = Single.defer(() -> providerService.getCompanyById(externalId, Arrays.asList(CompanyLayer.REPRESENTATION, CompanyLayer.SHAREHOLDERS)))
                .doOnSuccess(company -> companyDetailsCache.put(externalId, company));
        return cachedValue.switchIfEmpty(downloadData);
    }
}