package com.tkolbusz.mojepastwo.search;

import android.text.TextUtils;

import com.tkolbusz.domain.command.companies.SearchCompaniesCommand;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.mojepastwo.base.Controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class SearchController extends Controller<SearchView> {
    private final SearchCompaniesCommand searchCompaniesCommand;

    private final PublishSubject<String> queryPublisher;

    @Inject
    public SearchController(SearchCompaniesCommand searchCompaniesCommand) {
        this.searchCompaniesCommand = searchCompaniesCommand;
        this.queryPublisher = PublishSubject.create();
    }

    @Override
    protected void onViewInjected() {
        registerDisposable(createGetCompaniesStream());
    }

    void onNewSearchQuery(String query) {
        queryPublisher.onNext(query);
    }

    private Disposable createGetCompaniesStream() {
        return queryPublisher.debounce(200, TimeUnit.MILLISECONDS)
                .filter(query -> !TextUtils.isEmpty(query)) // skip empty string
                .switchMap(query -> getCompanies(query))
                .subscribe();
    }

    private Observable<List<Company>> getCompanies(String query) {
        return searchCompaniesCommand.apply(new SearchCompaniesCommand.Params(query))
                .doOnNext(companies -> getView().displayCompanies(companies))
                .onErrorResumeNext(error -> {
                    getView().displayError(error);
                    return Observable.empty();
                });
    }

}