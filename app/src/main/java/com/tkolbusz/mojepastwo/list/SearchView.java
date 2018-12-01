package com.tkolbusz.mojepastwo.list;

import android.view.LayoutInflater;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.mojepastwo.R;
import com.tkolbusz.mojepastwo.base.BaseView;
import com.tkolbusz.mojepastwo.base.IMainDisplay;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ViewConstructor")
public class SearchView extends BaseView {
    private final RecyclerView companiesListView;
    private final androidx.appcompat.widget.SearchView androidSearchView;
    private final Toolbar toolbar;
    public SearchView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay);
        LayoutInflater.from(mainDisplay.getContext()).inflate(R.layout.search_view,this,true);
        this.toolbar = findViewById(R.id.search_view_toolbar);
        this.companiesListView = findViewById(R.id.search_view_recyclerView);
        this.androidSearchView = findViewById(R.id.search_view_androidSearchView);

        toolbar.setTitle(getString(R.string.search_companies_title));
    }
}
