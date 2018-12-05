package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanyLayer;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.provider.dto.DataObjectDTO;
import com.tkolbusz.provider.dto.DataResponseDTO;
import com.tkolbusz.provider.dto.converter.CompanyConverter;
import com.tkolbusz.provider.dto.converter.CompanySmallConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

class ProviderService implements IProviderService {
    private final IMojePanstwoApi api;

    ProviderService(IMojePanstwoApi api) {
        this.api = api;
    }


    @Override
    public List<CompanySmall> searchCompanies(String searchQuery, int page, int limit) throws ConnectionException, ProviderException {
        try {
            Response<DataResponseDTO> response = api.searchCompanies(searchQuery, page, limit).execute();
            assertIsResponseSuccessful(response);
            DataResponseDTO body = response.body();
            return new CompanySmallConverter().transform(body.getDataObjectDTO());
        } catch (IOException e) {
            throw new ConnectionException();
        }
    }

    @Override
    public Company getCompanyById(int id, List<CompanyLayer> layers) throws ConnectionException, ProviderException {
        try {

            List<String> layerStrings = new ArrayList<>(layers.size());
            for (CompanyLayer layer : layers) {
                layerStrings.add(layer.getLayerName());
            }

            Response<DataResponseDTO> response = api.getCompanyById(id, layerStrings).execute();

            assertIsResponseSuccessful(response);

            DataResponseDTO body = response.body();
            if (body.getDataObjectDTO().size() == 0)
                throw new ProviderException("Company with id " + id + " not found", 404);
            if (body.getDataObjectDTO().size() > 1) {
                throw new ProviderException("Found multiple companies with id " + id, 500);
            }

            DataObjectDTO dataObjectDTO = body.getDataObjectDTO().get(0);

            return new CompanyConverter().transform(dataObjectDTO);
        } catch (IOException e) {
            throw new ConnectionException();
        }
    }

    private void assertIsResponseSuccessful(Response response) throws ProviderException {
        if (!response.isSuccessful()) {
            throw new ProviderException(response.message(), response.code());
        }
    }


}
