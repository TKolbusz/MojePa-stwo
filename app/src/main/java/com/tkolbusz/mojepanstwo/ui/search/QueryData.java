package com.tkolbusz.mojepanstwo.ui.search;

class QueryData {
    private final String query;
    private final int pageToLoad;

    private QueryData(String query, int pageToLoad) {
        this.query = query;
        this.pageToLoad = pageToLoad;
    }

    static QueryData from(String query, int pageToLoad) {
        return new QueryData(query, pageToLoad);
    }

    static QueryData from(String query) {
        return new QueryData(query, 0);
    }

    public int getPageToLoad() {
        return pageToLoad;
    }

    public String getQuery() {
        return query;
    }
}
