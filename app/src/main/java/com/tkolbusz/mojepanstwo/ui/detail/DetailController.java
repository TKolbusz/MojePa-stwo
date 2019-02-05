package com.tkolbusz.mojepanstwo.ui.detail;

import com.tkolbusz.domain.command.companies.GetCompanyDetails;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepanstwo.base.Controller;

import javax.inject.Inject;

import io.reactivex.observers.DisposableObserver;

public class DetailController extends Controller<DetailView> {
    private final GetCompanyDetails getCompanyDetailsCommand;

    @Inject
    DetailController(GetCompanyDetails getCompanyDetailsCommand) {
        this.getCompanyDetailsCommand = getCompanyDetailsCommand;
    }

    public void onGetCompanyDetails(CompanySmall company) {
        DisposableObserver<Company> observer = getCompanyDetailsCommand.apply(new GetCompanyDetails.Params(company))
                .subscribeWith(new DisposableObserver<Company>() {
                    @Override
                    protected void onStart() {
                        getView().clearView();
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
