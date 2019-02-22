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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Shareholder that = (Shareholder) o;

        if (shareCount != null ? !shareCount.equals(that.shareCount) : that.shareCount != null)
            return false;
        if (shareValuePerUnit != null ? !shareValuePerUnit.equals(that.shareValuePerUnit) : that.shareValuePerUnit != null)
            return false;
        return totalShareValue != null ? totalShareValue.equals(that.totalShareValue) : that.totalShareValue == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (shareCount != null ? shareCount.hashCode() : 0);
        result = 31 * result + (shareValuePerUnit != null ? shareValuePerUnit.hashCode() : 0);
        result = 31 * result + (totalShareValue != null ? totalShareValue.hashCode() : 0);
        return result;
    }
}
