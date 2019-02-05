package com.tkolbusz.mojepanstwo.ui.detail;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Shareholder;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

class ShareholdersAdapter extends RecyclerView.Adapter<ShareholderViewHolder> {
    private List<Shareholder> data = Collections.emptyList();

    @NotNull
    @Override
    public ShareholderViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ShareholderViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NotNull ShareholderViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void setData(List<Shareholder> shareholders) {
        this.data = shareholders;
        notifyDataSetChanged();
    }
}
