package com.tkolbusz.mojepastwo.ui.detail;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.base.BaseView;
import com.tkolbusz.mojepastwo.base.IMainDisplay;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ViewConstructor")
public class DetailView extends BaseView {
    private final DetailController controller;

    public DetailView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        controller = mainDisplay.getComponent().createDetailController();
    }

    public void setCompany(CompanySmall company) {
        controller.onGetCompanyDetails(company);
    }
}
