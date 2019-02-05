package com.tkolbusz.mojepanstwo.ui.detail;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.AppBarLayout;
import com.tkolbusz.domain.exception.ConnectionException;
import com.tkolbusz.domain.exception.ProviderException;
import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepanstwo.R;
import com.tkolbusz.mojepanstwo.base.BaseView;
import com.tkolbusz.mojepanstwo.base.IMainDisplay;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;

@SuppressWarnings("ViewConstructor")
public class DetailView extends BaseView {
    private final DetailController controller;
    private final ViewGroup progressLayout;

    private final AppBarLayout appBarLayout;
    private final Toolbar toolbar;
    private final TextView taxIdNoTextView;
    private final TextView regonTextView;
    private final TextView krsTextView;
    private final TextView registerDateTextView;
    private final TextView stockTextView;
    private final TextView addressTextView;
    private final TextView typeTextView;

    private final TextView managementPlainTextView;
    private final RecyclerView managementListView;
    private final ManagementAdapter managementAdapter;

    private final TextView shareholderPlainTextView;
    private final RecyclerView shareholdersListView;
    private final ShareholdersAdapter shareholdersAdapter;

    public DetailView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        Context context = mainDisplay.getContext();
        controller = mainDisplay.getComponent().createDetailController();
        setController(controller);
        inflate(context, R.layout.detail_view, this);
        progressLayout = findViewById(R.id.detail_progress_layout);
        appBarLayout = findViewById(R.id.detail_appbar_layout);
        toolbar = findViewById(R.id.detail_toolbar);
        toolbar.setNavigationOnClickListener(__ -> dismiss());
        regonTextView = findViewById(R.id.detail_item_regon_textView);
        stockTextView = findViewById(R.id.detail_stock_textView);
        taxIdNoTextView = findViewById(R.id.detail_item_taxidno_textView);
        typeTextView = findViewById(R.id.detail_item_type_textView);
        krsTextView = findViewById(R.id.detail_item_krs_textView);
        registerDateTextView = findViewById(R.id.detail_item_register_date_text);
        addressTextView = findViewById(R.id.detail_item_address_text);

        managementPlainTextView = findViewById(R.id.detail_management_textView);
        managementListView = findViewById(R.id.detail_management_recyclerView);
        managementListView.setLayoutManager(new LinearLayoutManager(context));
        managementListView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        this.managementAdapter = new ManagementAdapter();
        managementListView.setAdapter(managementAdapter);

        shareholderPlainTextView = findViewById(R.id.detail_shareholder_textView);
        shareholdersListView = findViewById(R.id.detail_shareholder_recyclerView);
        shareholdersListView.setLayoutManager(new LinearLayoutManager(context));
        shareholdersListView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        this.shareholdersAdapter = new ShareholdersAdapter();
        shareholdersListView.setAdapter(shareholdersAdapter);
    }

    public void setCompany(CompanySmall company) {
        controller.onGetCompanyDetails(company);
    }

    public void displayError(Throwable error) {
        if (error instanceof ConnectionException) {
            super.displayError(getString(R.string.no_connection_error));
        } else if (error instanceof ProviderException) {
            super.displayError(getString(R.string.internal_error, error.getMessage()));
        } else {
            error.printStackTrace();
            super.displayError(error);
        }
    }

    void hideView() {
        getMainDisplay().dismiss();
    }

    void showLoading() {
        // TODO: 12/20/18 layout shareholder nowa linia
        progressLayout.setVisibility(VISIBLE);
    }

    void hideLoading() {
        // TODO: 12/20/18 fix progress bar
        progressLayout.setVisibility(GONE);
    }


    void displayCompany(@NotNull Company company) {
        appBarLayout.setExpanded(true);
        toolbar.setTitle(company.getName());
        typeTextView.setText(company.getType());
        taxIdNoTextView.setText(getString(R.string.taxidno_with_fill, company.getTaxIdNo()));
        regonTextView.setText(getString(R.string.regon_with_fill, company.getRegon()));
        registerDateTextView.setText((company.getRegisterDateFormatted()));
        stockTextView.setText(company.getStock().toString());
        krsTextView.setText(getString(R.string.krs_with_fill, company.getKrsNumber()));
        addressTextView.setText(company.getAddress() != null ? company.getAddress().toString() : null);

        if (company.getManagement().size() > 0) {
            managementPlainTextView.setVisibility(VISIBLE);
            managementListView.setVisibility(VISIBLE);
        } else {
            managementPlainTextView.setVisibility(GONE);
            managementListView.setVisibility(GONE);
        }
        managementAdapter.setData(company.getManagement());

        if (company.getShareholders().size() > 0) {
            shareholderPlainTextView.setVisibility(VISIBLE);
            shareholdersListView.setVisibility(VISIBLE);
        } else {
            shareholderPlainTextView.setVisibility(GONE);
            shareholdersListView.setVisibility(GONE);
        }
        shareholdersAdapter.setData(company.getShareholders());
    }

    void clearView() {
        toolbar.setTitle("");
        taxIdNoTextView.setText("");
        regonTextView.setText("");
        registerDateTextView.setText("");
        stockTextView.setText("");
        krsTextView.setText("");
        addressTextView.setText("");
        typeTextView.setText("");

        managementPlainTextView.setVisibility(GONE);
        managementListView.setVisibility(GONE);
        managementAdapter.setData(Collections.emptyList());

        shareholderPlainTextView.setVisibility(GONE);
        shareholdersListView.setVisibility(GONE);
        shareholdersAdapter.setData(Collections.emptyList());
    }

}
