package com.tkolbusz.mojepastwo.ui.search;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.util.BasicDiffer;

import java.util.Collections;
import java.util.List;

class SearchListAdapter extends RecyclerView.Adapter<CompanyViewHolder> {
    private List<CompanySmall> data = Collections.emptyList();
    private final CompanyViewHolder.ClickListener clickListener;

    public SearchListAdapter(CompanyViewHolder.ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompanyViewHolder(parent, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void setData(List<CompanySmall> newList) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new BasicDiffer<>(data, newList));
        this.data = newList;
        diffResult.dispatchUpdatesTo(this);
    }
}
