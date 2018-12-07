package com.tkolbusz.mojepastwo.ui.detail;

import androidx.appcompat.widget.Toolbar;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.R;
import com.tkolbusz.mojepastwo.base.BaseView;
import com.tkolbusz.mojepastwo.base.IMainDisplay;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ViewConstructor")
public class DetailView extends BaseView {
    private final DetailController controller;
    private final Toolbar toolbar;
    public DetailView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        controller = mainDisplay.getComponent().createDetailController();
        setController(controller);
        inflate(mainDisplay.getContext(), R.layout.detail_view, this);
        toolbar = findViewById(R.id.detail_view_toolbar);
        toolbar.setNavigationOnClickListener(__ -> dismiss());
    }

    public void setCompany(CompanySmall company) {
        controller.onGetCompanyDetails(company);
    }

    public void displayError(Throwable e) {
        super.displayError(e);
    }

    void showLoading() {

    }

    void hideLoading() {

    }

    void displayCompany(Company company) {
        toolbar.setTitle(company.getName());
    }

}
