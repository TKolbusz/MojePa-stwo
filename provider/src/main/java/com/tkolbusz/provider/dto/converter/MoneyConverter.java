package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Currency;
import com.tkolbusz.domain.model.Money;
import com.tkolbusz.domain.util.BasicConverter;

public class MoneyConverter extends BasicConverter<Money, Double> {
    @Override
    public Money transform(Double DTO) {
        if (DTO == null) {
            return null;
        }
        return new Money(DTO, Currency.PLN);
    }
}