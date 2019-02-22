package com.tkolbusz.provider;

import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanyLayer;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.provider.dto.converter.CompanyConverter;
import com.tkolbusz.provider.dto.converter.CompanySmallConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Function;
import retrofit2.Response;

class ProviderService implements IProviderService {
    private final IMojePanstwoApi api;

    ProviderService(IMojePanstwoApi api) {
        this.api = api;
    }


    @Override
    public Single<List<CompanySmall>> searchCompanies(String searchQuery, int page, int limit) {
        return api.searchCompanies(searchQuery, page, limit)
                .doOnSuccess(this::assertIsResponseSuccessful)
                .map(response -> new CompanySmallConverter().transform(response.body().getDataObjectDTO()))
                .onErrorResumeNext(transformIOExceptionIntoConnectionException());
    }

    @Override
    public Single<Company> getCompanyById(int id, List<CompanyLayer> layers) {
        return Single.fromCallable(() -> {
            List<String> layerStrings = new ArrayList<>(layers.size());
            for (CompanyLayer layer : layers) {
                layerStrings.add(layer.getLayerName());
            }
            return layerStrings;
        })
                .flatMap(layerStrings -> api.getCompanyById(id, layerStrings))
                .doOnSuccess(this::assertIsResponseSuccessful)
                .map(response -> new CompanyConverter().transform(response.body()))
                .onErrorResumeNext(transformIOExceptionIntoConnectionException());
    }

    private void assertIsResponseSuccessful(Response response) throws ProviderException {
        if (!response.isSuccessful() || response.body() == null) {
            throw new ProviderException(response.message(), response.code());
        }
    }

    private <T> Function<Throwable, Single<T>> transformIOExceptionIntoConnectionException() {
        // if error is IOException then transform it into ConnectionException
        return error -> Single.error(error instanceof IOException ? new ConnectionException() : error);
    }


}
