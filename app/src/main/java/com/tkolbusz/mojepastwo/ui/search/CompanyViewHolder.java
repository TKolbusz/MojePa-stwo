package com.tkolbusz.mojepastwo.ui.search;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.mojepastwo.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class CompanyViewHolder extends RecyclerView.ViewHolder {
    private final TextView companyNameTextView;
    private final TextView companyTypeTextView;
    private final TextView companyDetailsTextView;
    private CompanySmall company;

    CompanyViewHolder(@NonNull ViewGroup parent, ClickListener clickListener) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.search_company_item, parent, false));
        this.companyTypeTextView = itemView.findViewById(R.id.companyTypeTextView);
        this.companyNameTextView = itemView.findViewById(R.id.companyNameTextView);
        this.companyDetailsTextView = itemView.findViewById(R.id.companyDetailsTextView);
        itemView.setOnClickListener(v -> clickListener.onClick(company));
    }

    void bind(@NotNull CompanySmall company) {
        this.company = company;
        companyTypeTextView.setText(company.getType());
        companyNameTextView.setText(company.getName());
        companyDetailsTextView.setText(formDetails(company));
    }

    private String formDetails(CompanySmall company) {
        StringBuilder builder = new StringBuilder();
        if (!TextUtils.isEmpty(company.getKrsNumber())) {
            builder.append("KRS ");
            builder.append(company.getKrsNumber());
        }
        if (company.getAddress() != null && !TextUtils.isEmpty(company.getAddress().getCity())) {
            builder.append(" - ");
            builder.append(company.getAddress().getCity());
        }
        if (company.getRegisterDate() != null) {
            builder.append(" - ");
            builder.append(itemView.getContext().getString(R.string.registered));
            builder.append(" ");
            builder.append(company.getRegisterDateFormatted());
        }
        return builder.toString();
    }

    interface ClickListener {
        void onClick(@Nullable CompanySmall company);
    }
}
