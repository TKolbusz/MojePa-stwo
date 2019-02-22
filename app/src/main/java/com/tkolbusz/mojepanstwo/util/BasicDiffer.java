package com.tkolbusz.mojepanstwo.util;

import androidx.recyclerview.widget.DiffUtil;

import com.tkolbusz.domain.util.Function;

import java.util.List;
import java.util.Objects;

public class BasicDiffer<T, C> extends DiffUtil.Callback {
    private final List<T> oldList;
    private final List<T> newList;
    private final Function<T, C> comparator;

    public BasicDiffer(List<T> oldList, List<T> newList, Function<T, C> comparator) {
        this.oldList = oldList;
        this.newList = newList;
        this.comparator = comparator;
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
        return Objects.equals(comparator.apply(old), comparator.apply(neww));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return true;
    }
}
