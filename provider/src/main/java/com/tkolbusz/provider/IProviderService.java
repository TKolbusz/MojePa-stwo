package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.CompanySmall;

import java.util.List;

public interface IProviderService {
    List<CompanySmall> searchCompanies(String searchQuery, int page, int limit) throws ConnectionException, ProviderException;
}
