package com.tkolbusz.mojepastwo.ui.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.mojepastwo.R;

class RetryViewHolder extends RecyclerView.ViewHolder {
    public RetryViewHolder(@NonNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.load_again_item, parent, false));
    }
}
