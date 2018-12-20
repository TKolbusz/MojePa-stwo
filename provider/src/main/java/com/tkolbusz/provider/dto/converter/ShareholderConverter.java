package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Shareholder;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.ShareholderDTO;

import org.jetbrains.annotations.Nullable;

class ShareholderConverter extends BasicConverter<Shareholder, ShareholderDTO> {
    @Nullable
    @Override
    public Shareholder transform(@Nullable ShareholderDTO DTO) {
        if (DTO == null) {
            return null;
        }
        return new Shareholder(
                DTO.getNazwa(),
                DTO.getUdzialyLiczba(),
                new MoneyConverter().transform(DTO.getUdzialyWartoscJedn()),
                new MoneyConverter().transform(DTO.getUdzialyWartosc())
        );
    }
}

