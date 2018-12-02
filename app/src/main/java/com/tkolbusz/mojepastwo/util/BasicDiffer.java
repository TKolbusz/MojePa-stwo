package com.tkolbusz.mojepastwo.util;

import androidx.recyclerview.widget.DiffUtil;

import java.util.List;
import java.util.Objects;

public class BasicDiffer<T> extends DiffUtil.Callback {
    private final List<T> oldList;
    private final List<T> newList;

    public BasicDiffer(List<T> oldList, List<T> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        T old = oldList.get(oldItemPosition);
        T neww = newList.get(newItemPosition);
        return Objects.equals(old, neww);
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return true;
    }
}
