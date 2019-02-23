package com.tkolbusz.domain.repository;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;

import java.util.List;

import io.reactivex.Single;

public interface CompanyRepository {
    Single<List<CompanySmall>> getCompanies(String query, int page);

    Single<Company> getCompanyById(int externalId);
}