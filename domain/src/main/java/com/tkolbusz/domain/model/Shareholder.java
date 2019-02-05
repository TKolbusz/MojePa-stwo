package com.tkolbusz.domain.model;

public class Shareholder extends Person {
    private final Integer shareCount;
    private final Money shareValuePerUnit;
    private final Money totalShareValue;

    public Shareholder(String fullName, Integer shareCount, Money shareValuePerUnit, Money totalShareValue) {
        super(fullName);
        this.shareCount = shareCount;
        this.shareValuePerUnit = shareValuePerUnit;
        this.totalShareValue = totalShareValue;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public Money getShareValuePerUnit() {
        return shareValuePerUnit;
    }

    public Money getTotalShareValue() {
        return totalShareValue;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();

        if (totalShareValue != null)
            strb.append(totalShareValue.toString());
        if (shareCount != null) {
            strb.append(" (");
            strb.append(shareCount);
            strb.append(" x ");
            strb.append(shareValuePerUnit.toString());
            strb.append(")");
        }
        return strb.toString();
    }
}
