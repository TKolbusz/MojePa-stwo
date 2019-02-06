package com.tkolbusz.domain.model;

public class QueryData {
    private final String query;
    private final int pageToLoad;

    private QueryData(String query, int pageToLoad) {
        this.query = query;
        this.pageToLoad = pageToLoad;
    }

    public static QueryData from(String query, int pageToLoad) {
        return new QueryData(query, pageToLoad);
    }

    public static QueryData from(String query) {
        return new QueryData(query, 0);
    }

    public int getPageToLoad() {
        return pageToLoad;
    }

    public String getQuery() {
        return query;
    }
}
