package com.tkolbusz.mojepanstwo.ui.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Shareholder;
import com.tkolbusz.mojepanstwo.R;

import org.jetbrains.annotations.NotNull;

class ShareholderViewHolder extends RecyclerView.ViewHolder {
    private final TextView shareholderNameTextView;
    private final TextView sharesInfoTextView;

    ShareholderViewHolder(@NotNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_shareholder_item, parent, false));
        this.shareholderNameTextView = itemView.findViewById(R.id.detail_shareholder_item_name_textView);
        this.sharesInfoTextView = itemView.findViewById(R.id.detail_shareholder_item_shares_textView);
    }

    void bind(@NotNull Shareholder shareholder) {
        shareholderNameTextView.setText(shareholder.getFullName());
        sharesInfoTextView.setText(shareholder.toString());
    }


}
