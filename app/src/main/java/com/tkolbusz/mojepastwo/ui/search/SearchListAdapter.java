package com.tkolbusz.mojepastwo.ui.search;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.util.BasicDiffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SearchListAdapter extends RecyclerView.Adapter {
    private static final int COMPANY = 1;
    private static final int LOADING = 2;
    private static final int RETRY = 3;
    private final CompanyViewHolder.ClickListener clickListener;
    private final LoadMoreListener loadMoreListener;
    private List<CompanySmall> data = Collections.emptyList();
    private boolean loadAgain = false;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int nextPage = 0;


    SearchListAdapter(RecyclerView recyclerView, CompanyViewHolder.ClickListener clickListener, LoadMoreListener loadMoreListener) {
        this.clickListener = clickListener;
        this.loadMoreListener = loadMoreListener;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager layoutManager = ((LinearLayoutManager) recyclerView.getLayoutManager());
                int visibleItemCount = layoutManager.getChildCount();
                int totalItemCount = layoutManager.getItemCount();
                int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();

                if (!isLoading &&
                        !isLastPage &&
                        !loadAgain &&
                        (visibleItemCount + firstVisibleItemPosition) >= totalItemCount &&
                        firstVisibleItemPosition >= 0
                ) {
                    loadNextPage();
                }
            }
        });

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case COMPANY:
                return new CompanyViewHolder(parent, clickListener);
            case LOADING:
                return new LoadingViewHolder(parent);
            case RETRY:
                return new RetryViewHolder(parent, __ -> loadNextPage());
        }
        return new CompanyViewHolder(parent, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CompanyViewHolder) {
            ((CompanyViewHolder) holder).bind(data.get(position));
        } else if (holder instanceof LoadingViewHolder) {

        } else if (holder instanceof RetryViewHolder) {

        } else
            throw new IllegalArgumentException("Unknown ViewHolder: " + holder.getClass().getSimpleName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (!isLoading && loadAgain && (getItemCount() - 1) == position) {
            return RETRY;
        } else if (data.get(position) != null) {
            return COMPANY;
        } else {
            return LOADING;
        }
    }

    void setData(List<CompanySmall> data, int currentPage, boolean isLastPage) {
        this.isLoading = false;
        this.loadAgain = false;
        this.nextPage = currentPage;
        this.isLastPage = isLastPage;
        List<CompanySmall> newList = new ArrayList<>(data);
        List<CompanySmall> oldList = this.data;
        if (!isLastPage)
            newList.add(null);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new BasicDiffer<>(oldList, newList));
        this.data = newList;
        diffResult.dispatchUpdatesTo(this);
    }

    void setLoadAgain() {
        loadAgain = true;
        isLoading = false;
        notifyItemChanged(getItemCount() - 1);
    }

    private void loadNextPage() {
        isLoading = true;
        loadMoreListener.onLoadMore(nextPage);
        notifyItemChanged(getItemCount() - 1);
    }

    interface LoadMoreListener {
        void onLoadMore(int pageToLoad);
    }
}
