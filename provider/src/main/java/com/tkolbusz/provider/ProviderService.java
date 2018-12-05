package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.provider.dto.DataResponseDTO;
import com.tkolbusz.provider.dto.converter.CompanyConverter;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

class ProviderService implements IProviderService {
    private final IMojePanstwoApi api;

    ProviderService(IMojePanstwoApi api) {
        this.api = api;
    }


    @Override
    public List<Company> searchCompanies(String searchQuery, int page, int limit) throws ConnectionException, ProviderException {
        try {
            Response<DataResponseDTO> response = api.searchCompanies(searchQuery, page, limit).execute();
            assertIsResponseSuccessful(response);
            DataResponseDTO body = response.body();
            return new CompanyConverter().transform(body.getDataObjectDTO());
        } catch (IOException e) {
            throw new ConnectionException();
        }
    }

    private void assertIsResponseSuccessful(Response response) throws ProviderException {
        if (!response.isSuccessful()) {
            if (response.code() >= 500) {
            }
            throw new ProviderException(response.message(), response.code());
        }
    }


}
