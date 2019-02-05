package com.tkolbusz.mojepanstwo.ui.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Management;
import com.tkolbusz.mojepanstwo.R;

import org.jetbrains.annotations.NotNull;

class ManagementViewHolder extends RecyclerView.ViewHolder {
    private final TextView managementNameTextView;
    private final TextView positionTextView;

    ManagementViewHolder(@NotNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_management_item, parent, false));
        this.managementNameTextView = itemView.findViewById(R.id.detail_management_item_name_textView);
        this.positionTextView = itemView.findViewById(R.id.detail_management_item_position_textView);
    }

    void bind(@NotNull Management management) {
        managementNameTextView.setText(management.getFullName());
        positionTextView.setText(management.getPosition().toString());
    }

}
