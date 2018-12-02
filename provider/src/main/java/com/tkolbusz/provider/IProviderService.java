package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;

import java.util.List;

public interface IProviderService {
    List<Company> searchCompanies(String searchQuery) throws ConnectionException, ProviderException;
}
