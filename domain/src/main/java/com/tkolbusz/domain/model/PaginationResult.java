package com.tkolbusz.domain.model;

import java.util.Collections;
import java.util.List;

public class PaginationResult<T> {
    private final List<T> data;
    private final int nextPage;
    private final boolean isLastPage;

    PaginationResult(List<T> data, int nextPage, boolean isLastPage) {
        this.data = data;
        this.nextPage = nextPage;
        this.isLastPage = isLastPage;
    }

    public static <T> PaginationResult<T> from(List<T> data, int page, boolean isLastPage) {
        return new PaginationResult<>(data, page, isLastPage);
    }

    public static <T> PaginationResult<T> firstPage() {
        return new PaginationResult<>(Collections.emptyList(), 0, true);
    }

    public List<T> getData() {
        return data;
    }

    public int getNextPage() {
        return nextPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }
}