package com.tkolbusz.provider;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProviderServiceFactory {
    private static ProviderService INSTANCE = null;

    public synchronized static ProviderService getProviderService() {
        if (INSTANCE == null) INSTANCE = new ProviderService(createApi());
        return INSTANCE;
    }

    private static IMojePanstwoApi createApi() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor())
                .build();
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(IMojePanstwoApi.BASE_URL)
                .client(client)
                .build()
                .create(IMojePanstwoApi.class);
    }
}
