package com.tkolbusz.provider;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanyLayer;
import com.tkolbusz.domain.model.CompanySmall;

import java.util.List;

import io.reactivex.Single;

public interface IProviderService {
    Single<List<CompanySmall>> searchCompanies(String searchQuery, int page, int limit);

    Single<Company> getCompanyById(int id, List<CompanyLayer> companyLayers);
}
