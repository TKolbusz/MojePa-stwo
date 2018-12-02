package com.tkolbusz.mojepastwo.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.mojepastwo.R;

import org.jetbrains.annotations.NotNull;

class CompanyViewHolder extends RecyclerView.ViewHolder {
    private final TextView companyNameTextView;

    CompanyViewHolder(@NonNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.search_company_item, parent, false));
        this.companyNameTextView = itemView.findViewById(R.id.companyNameTextView);
    }

    void bind(@NotNull Company company) {
        companyNameTextView.setText(company.getName());
    }
}
