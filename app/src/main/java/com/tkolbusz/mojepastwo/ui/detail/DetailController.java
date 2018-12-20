package com.tkolbusz.mojepastwo.ui.detail;

import com.tkolbusz.domain.command.companies.GetCompanyDetailsCommand;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.base.Controller;

import javax.inject.Inject;

import io.reactivex.observers.DisposableObserver;

public class DetailController extends Controller<DetailView> {
    private final GetCompanyDetailsCommand getCompanyDetailsUseCase;

    @Inject
    DetailController(GetCompanyDetailsCommand getCompanyDetailsUseCase) {
        this.getCompanyDetailsUseCase = getCompanyDetailsUseCase;
    }

    public void onGetCompanyDetails(CompanySmall company) {
        DisposableObserver<Company> observer = getCompanyDetailsUseCase.apply(new GetCompanyDetailsCommand.Params(company))
                .subscribeWith(new DisposableObserver<Company>() {
                    @Override
                    protected void onStart() {
                        getView().showLoading();
                    }

                    @Override
                    public void onNext(Company company) {
                        getView().displayCompany(company);
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().hideLoading();
                        getView().displayError(e);
                        getView().hideView();
                    }

                    @Override
                    public void onComplete() {
                        getView().hideLoading();
                    }
                });

        registerDisposable(observer);
    }
}
