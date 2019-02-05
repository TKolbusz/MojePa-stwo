package com.tkolbusz.mojepanstwo.ui.detail;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Management;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

class ManagementAdapter extends RecyclerView.Adapter<ManagementViewHolder> {
    private List<Management> data = Collections.emptyList();

    @NotNull
    @Override
    public ManagementViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ManagementViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NotNull ManagementViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void setData(List<Management> shareholders) {
        this.data = shareholders;
        notifyDataSetChanged();
    }
}
