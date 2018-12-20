package com.tkolbusz.mojepastwo.ui.detail;

import android.widget.TextView;

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
    private final TextView taxIdNoTextView;
    private final TextView regonTextView;
    private final TextView krsTextView;
    private final TextView registerDateTextView;
    private final TextView stockTextView;
    private final TextView addressTextView;

    public DetailView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        controller = mainDisplay.getComponent().createDetailController();
        setController(controller);
        inflate(mainDisplay.getContext(), R.layout.detail_view, this);
        toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setNavigationOnClickListener(__ -> dismiss());
        taxIdNoTextView = findViewById(R.id.bill_detail_item_title_textView);
        krsTextView = findViewById(R.id.bill_detail_item_additions_plain_text);
        regonTextView = findViewById(R.id.bill_detail_item_kitchen_and_date_textView);
        registerDateTextView = findViewById(R.id.bill_detail_item_title_textView);
        stockTextView = findViewById(R.id.bill_detail_item_waiter_textView);
        addressTextView = findViewById(R.id.bill_detail_item_set_elements_plain_text);
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
        if (true) return;
        toolbar.setTitle(company.getName());
        taxIdNoTextView.setText(company.getTaxIdNo());
        regonTextView.setText(company.getRegon());
        registerDateTextView.setText((company.getRegisterDateFormatted()));
        stockTextView.setText(company.getStock().toString());
        krsTextView.setText(company.getKrsNumber());
        addressTextView.setText(company.getAddress() != null ? company.getAddress().toString() : null);
    }

    public void hideView() {
        getMainDisplay().dismiss();
    }
}
