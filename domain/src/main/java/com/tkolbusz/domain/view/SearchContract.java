package com.tkolbusz.domain.view;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.model.QueryData;

import java.util.List;

public interface SearchContract {
    interface Controller {
        void onCompanySelected(CompanySmall companySmall);

        void onNewSearchQuery(QueryData query);

        void onLoadMoreData(QueryData queryData);
    }

    interface View {

        void displayCompanies(List<CompanySmall> data, int nextPage, boolean lastPage);

        void displayError(Throwable error);

        void setLoadingNextPageFailed();

        void displayCompanyDetailsView(CompanySmall companySmall);
    }
}
