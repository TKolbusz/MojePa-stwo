package com.tkolbusz.mojepastwo.ui.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkolbusz.mojepastwo.R;

class LoadingViewHolder extends RecyclerView.ViewHolder {
    public LoadingViewHolder(@NonNull ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.loading_item, parent, false));
    }

}
