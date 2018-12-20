package com.tkolbusz.domain.model;

public class Shareholder extends Person {
    private final int shareCount;
    private final Money shareValuePerUnit;
    private final Money totalShareValue;

    public Shareholder(String fullName, int shareCount, Money shareValuePerUnit, Money totalShareValue) {
        super(fullName);
        this.shareCount = shareCount;
        this.shareValuePerUnit = shareValuePerUnit;
        this.totalShareValue = totalShareValue;
    }

    public int getShareCount() {
        return shareCount;
    }

    public Money getShareValuePerUnit() {
        return shareValuePerUnit;
    }

    public Money getTotalShareValue() {
        return totalShareValue;
    }
}
