package com.tkolbusz.mojepanstwo.ui.search;

import com.tkolbusz.domain.command.companies.SearchCompanies;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.PaginationResult;
import com.tkolbusz.domain.model.QueryData;
import com.tkolbusz.domain.view.SearchContract;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.TestScheduler;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SearchControllerTest {

    @Mock
    SearchCompanies searchCompanies;
    @Mock
    SearchContract.View view;

    @Test
    public void nextPageDataIsDisplayed() {
        PaginationResult<CompanySmall> result = PaginationResult.from(Collections.emptyList(), 3, true);
        when(searchCompanies.apply(any())).thenReturn(Observable.just(result));

        SearchController controller = getInstance();
        controller.setView(view);
        controller.onLoadMoreData(QueryData.from("test", 2));

        verify(view).displayCompanies(eq(Collections.emptyList()), eq(3), eq(true));
    }

    @Test
    public void newSearchQueryIsDebounced() {
        PaginationResult<CompanySmall> result = PaginationResult.from(Collections.emptyList(), 1, true);
        when(searchCompanies.apply(any())).thenReturn(Observable.just(result));

        TestScheduler testScheduler = new TestScheduler();
        SearchController controller = getInstance(testScheduler);
        controller.setView(view);
        controller.onNewSearchQuery(QueryData.from("test"));
        controller.onNewSearchQuery(QueryData.from("test"));
        testScheduler.advanceTimeBy(SearchController.DEBOUNCE_TIME_MS, TimeUnit.MILLISECONDS);

        verify(searchCompanies).apply(any());

        verifyNoMoreInteractions(searchCompanies);

        verify(view).displayCompanies(eq(Collections.emptyList()), eq(1), eq(true));
    }


    @Test
    public void errorIsDisplayed() {
        when(searchCompanies.apply(any())).thenReturn(Observable.error(ConnectionException::new));
        SearchController controller = getInstance();
        controller.setView(view);
        controller.onNewSearchQuery(QueryData.from("test"));

        verify(view).displayError(any());
    }

    @Test
    public void selectingCompanyDisplaysDetails() {
        CompanySmall small = new CompanySmall(1, "test", "test", null, "123", new Date());
        SearchController controller = getInstance();
        controller.setView(view);

        controller.onCompanySelected(small);
        verify(view).displayCompanyDetailsView(eq(small));

        verifyNoMoreInteractions(view);
    }

    private SearchController getInstance() {
        return getInstance(Schedulers.trampoline());
    }

    private SearchController getInstance(Scheduler delayScheduler) {
        return new SearchController(searchCompanies, Schedulers::trampoline, () -> delayScheduler);
    }

}