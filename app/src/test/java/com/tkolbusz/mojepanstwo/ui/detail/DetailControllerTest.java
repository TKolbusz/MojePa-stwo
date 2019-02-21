package com.tkolbusz.mojepanstwo.ui.detail;

import com.tkolbusz.domain.command.companies.GetCompanyDetails;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.Currency;
import com.tkolbusz.domain.model.Money;
import com.tkolbusz.domain.view.DetailContract;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Date;

import io.reactivex.Observable;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DetailControllerTest {
    @Mock
    GetCompanyDetails getCompanyDetails;
    @Mock
    DetailContract.View view;

    @Test
    public void detailDataIsDisplayed() {
        Company item = getTestCompany();
        CompanySmall smallItem = getTestCompanySmall();
        when(getCompanyDetails.apply(any())).thenReturn(Observable.just(item));
        DetailController controller = getInstance();
        controller.setView(view);
        controller.onGetCompanyDetails(smallItem);

        verify(view).clearView();
        verify(view).showLoading();
        verify(view).displayCompany(eq(item));
        verify(view).hideLoading();

        verifyNoMoreInteractions(view);
    }

    @Test
    public void errorIsDisplayed() {
        CompanySmall smallItem = getTestCompanySmall();
        when(getCompanyDetails.apply(any())).thenReturn(Observable.error(ConnectionException::new));
        DetailController controller = getInstance();
        controller.setView(view);
        controller.onGetCompanyDetails(smallItem);

        verify(view).clearView();
        verify(view).showLoading();
        verify(view).displayError(any());
        verify(view).hideLoading();
        verify(view).hideView();

        verifyNoMoreInteractions(view);
    }

    private Company getTestCompany() {
        return new Company(
                getTestCompanySmall(),
                "regon",
                new Money(0d, Currency.PLN),
                Collections.emptyList(),
                Collections.emptyList(),
                "taxIdNo");
    }

    private CompanySmall getTestCompanySmall() {
        return new CompanySmall(1, "test", "test", null, "123", new Date());
    }


    private DetailController getInstance() {
        return new DetailController(getCompanyDetails);
    }

}