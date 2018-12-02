package com.tkolbusz.mojepastwo.search;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.mojepastwo.util.BasicDiffer;

import java.util.Collections;
import java.util.List;

class SearchListAdapter extends RecyclerView.Adapter<CompanyViewHolder> {
    private List<Company> data = Collections.emptyList();

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompanyViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void setData(List<Company> newList) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new BasicDiffer<>(data, newList));
        this.data = newList;
        diffResult.dispatchUpdatesTo(this);
    }
}
