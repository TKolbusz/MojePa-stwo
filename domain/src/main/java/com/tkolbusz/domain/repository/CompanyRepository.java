package com.tkolbusz.domain.repository;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.CompanySmall;

import java.util.List;

public interface CompanyRepository {
    List<CompanySmall> getCompanies(String query, int page) throws ConnectionException, ProviderException;
}
