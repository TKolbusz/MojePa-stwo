package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Response;

public class ProviderService {
    private final IMojePanstwoApi api;

    public ProviderService(IMojePanstwoApi api) {
        this.api = api;
    }


    public List<String> getCompanies(String searchQuery) throws ConnectionException, ProviderException {
        try {
            Response<DataResponseDTO> response = api.searchCompanies(searchQuery).execute();
            assertIsResponseSuccessful(response);
            DataResponseDTO body = response.body();
            return body.getDataObjectDTO().stream().map(d -> d.getDataDTO().getKrsPodmiotyNazwa()).collect(Collectors.toList());
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
