package com.tkolbusz.domain.command.companies;

import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.command.companies.GetCompanyDetails.Params;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.Currency;
import com.tkolbusz.domain.model.Money;
import com.tkolbusz.domain.repository.CompanyRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Date;

import io.reactivex.schedulers.Schedulers;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetCompanyDetailsTest {
    @Mock
    CompanyRepository companyRepository;

    @Test
    public void repositoryCalledWithId() throws ConnectionException, ProviderException {
        Company company = getTestCompany();
        when(companyRepository.getCompanyById(eq(1))).thenReturn(company);
        GetCompanyDetails getCompanyDetails = get();
        CompanySmall companySmall = new CompanySmall(1, null, null, null, null, null);
        getCompanyDetails.buildObservable(new Params(companySmall))
                .test()
                .assertNoErrors()
                .assertNoErrors()
                .assertValue(c -> c.equals(company));

        verify(companyRepository).getCompanyById(eq(1));
    }

    private Company getTestCompany() {
        return new Company(
                1,
                "test",
                "test",
                null,
                "123",
                new Date(),
                "regon",
                new Money(0d, Currency.PLN),
                Collections.emptyList(),
                Collections.emptyList(),
                "taxIdNo");
    }

    private GetCompanyDetails get() {
        return new GetCompanyDetails(
                new CommandData(Schedulers::trampoline, Schedulers::trampoline, false),
                companyRepository
        );
    }
}
