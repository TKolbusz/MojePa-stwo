package com.tkolbusz.mojepastwo.list;

import com.tkolbusz.mojepastwo.base.Controller;
import com.tkolbusz.provider.ProviderService;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

public class SearchController extends Controller<SearchView> {
    private final ProviderService providerService;

    private final PublishSubject<String> queryPublisher;

    @Inject
    public SearchController(ProviderService providerService) {
        this.providerService = providerService;
        queryPublisher = PublishSubject.create();
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
                .switchMapSingle(query -> getCompanies(query))
                .subscribe(companies -> getView().displayCompanies(companies));
    }

    private Single<List<String>> getCompanies(String query) {
        return Single.create((SingleEmitter<List<String>> emitter) -> {
            try {
                emitter.onSuccess(providerService.getCompanies(query));
            } catch (Exception e) {
                // pass error to stream if not disposed
                emitter.tryOnError(e);
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }
}