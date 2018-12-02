package com.tkolbusz.provider;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMojePanstwoApi {
    String BASE_URL = "https://api-v3.mojepanstwo.pl/";

    @GET("/dane/krs_podmioty.json")
    Call<DataResponseDTO> searchCompanies(@Query("conditions[q]") String searchQuery);
}
