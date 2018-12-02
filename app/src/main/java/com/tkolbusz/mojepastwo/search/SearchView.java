package com.tkolbusz.mojepastwo.search;

import android.view.LayoutInflater;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.mojepastwo.MojePanstwoApplication;
import com.tkolbusz.mojepastwo.R;
import com.tkolbusz.mojepastwo.base.BaseView;
import com.tkolbusz.mojepastwo.base.IMainDisplay;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("ViewConstructor")
public class SearchView extends BaseView {
    private final RecyclerView companiesListView;
    private final androidx.appcompat.widget.SearchView androidSearchView;
    private final Toolbar toolbar;

    private final SearchController controller;
    public SearchView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        this.controller = MojePanstwoApplication.getComponent(mainDisplay.getContext()).createSearchController();
        LayoutInflater.from(mainDisplay.getContext()).inflate(R.layout.search_view,this,true);
        toolbar = findViewById(R.id.search_view_toolbar);
        companiesListView = findViewById(R.id.search_view_recyclerView);

        toolbar.setTitle(getString(R.string.search_companies_title));
        toolbar.inflateMenu(R.menu.search_menu);

        androidSearchView = ((androidx.appcompat.widget.SearchView) toolbar.getMenu().findItem(R.id.action_search).getActionView());
        androidSearchView.setMaxWidth(Integer.MAX_VALUE);

        androidSearchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                controller.onNewSearchQuery(newText);
                return false;
            }
        });

    }

    public void displayCompanies(List<String> companies) {

    }
}
