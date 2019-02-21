package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.command.companies.SearchCompanies.Params;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.repository.CompanyRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import io.reactivex.schedulers.Schedulers;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SearchCompaniesTest {
    @Mock
    CompanyRepository companyRepository;

    @Test
    public void emptyQueryReturnsEmptyList() {
        SearchCompanies searchCompanies = get();
        searchCompanies.buildObservable(new Params("", 0))
                .test()
                .assertNoErrors()
                .assertComplete()
                .assertValue(paginationResult -> paginationResult.getData().isEmpty() && paginationResult.isLastPage());
    }

    @Test
    public void resultReturnedWithNextPage() {
        SearchCompanies searchCompanies = get();
        searchCompanies.buildObservable(new Params("test", 2))
                .test()
                .assertComplete()
                .assertNoErrors()
                .assertValue(paginationResult -> paginationResult.getNextPage() == 3);
    }

    @Test
    public void getCompaniesCalled() throws ConnectionException, ProviderException {
        List<CompanySmall> list = Arrays.asList(new CompanySmall(1, "test", "test", null, "123", new Date()));
        when(companyRepository.getCompanies(eq("test"), eq(2))).thenReturn(list);
        SearchCompanies searchCompanies = get();
        searchCompanies.buildObservable(new Params("test", 2))
                .test()
                .assertNoErrors()
                .assertValue(paginationResult -> paginationResult.getData().equals(list))
                .assertComplete();
        verify(companyRepository).getCompanies(eq("test"), eq(2));
    }

    private SearchCompanies get() {
        return new SearchCompanies(
                new CommandData(Schedulers::trampoline, Schedulers::trampoline, false),
                companyRepository

        );
    }
}