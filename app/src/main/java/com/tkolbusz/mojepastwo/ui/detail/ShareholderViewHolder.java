package com.tkolbusz.mojepastwo.ui.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Money;
import com.tkolbusz.domain.model.Shareholder;
import com.tkolbusz.mojepastwo.R;

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
        sharesInfoTextView.setText(formatShares(shareholder.getShareCount(), shareholder.getTotalShareValue()));
    }

    private String formatShares(int count, Money totalValue) {
        StringBuilder strb = new StringBuilder();
        strb.append(count);
        if (totalValue != null) {
            strb.append(" ");
            strb.append(itemView.getContext().getString(R.string.total_shared_value_text));
            strb.append(" ");
            strb.append(totalValue.toString());
        }
        return strb.toString();
    }
}