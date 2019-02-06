package com.tkolbusz.domain.view;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;

public interface DetailContract {
    interface Controller {
        void onGetCompanyDetails(CompanySmall companySmall);

    }

    interface View {

        void clearView();

        void showLoading();

        void hideLoading();

        void hideView();

        void displayError(Throwable e);

        void displayCompany(Company company);
    }
}
