package com.tkolbusz.provider;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ProviderServiceTest {
    @Test
    public void getCompanies() throws Exception {
        ProviderService providerService = ProviderServiceFactory.getProviderService();
        List<String> orlen = providerService.searchCompanies("Orlen");
        assertTrue(orlen.size() > 0);
    }
}