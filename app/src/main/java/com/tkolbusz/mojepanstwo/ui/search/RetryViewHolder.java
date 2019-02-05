package com.tkolbusz.mojepanstwo.ui.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.mojepanstwo.R;

class RetryViewHolder extends RecyclerView.ViewHolder {
    public RetryViewHolder(@NonNull ViewGroup parent, View.OnClickListener buttonClickListener) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.load_again_item, parent, false));
        itemView.findViewById(R.id.load_again_item_button).setOnClickListener(buttonClickListener);
    }
}