package com.tkolbusz.provider;

import com.tkolbusz.provider.dto.DataObjectDTO;
import com.tkolbusz.provider.dto.DataResponseDTO;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IMojePanstwoApi {
    String BASE_URL = "https://api-v3.mojepanstwo.pl/";

    @GET("/dane/krs_podmioty.json")
    Single<Response<DataResponseDTO>> searchCompanies(@Query("conditions[q]") String searchQuery, @Query("page") int page, @Query("limit") int limit);

    @GET("/dane/krs_podmioty/{companyId}.json")
    Single<Response<DataObjectDTO>> getCompanyById(@Path("companyId") int id, @Query("layers[]") List<String> layers);
}