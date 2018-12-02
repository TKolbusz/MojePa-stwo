package com.tkolbusz.domain.model;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount.setScale(2, BigDecimal.ROUND_HALF_UP);
        this.currency = currency;
    }

    public Money(double amount, String currency) {
        this(amount, Currency.valueOf(currency));
    }

    public Money(double amount, Currency currency) {
        this(BigDecimal.valueOf(amount), currency);
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public double getAmountDouble() {
        return amount.doubleValue();
    }
}
