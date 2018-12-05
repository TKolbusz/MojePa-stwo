package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.DataObjectDTO;

import org.jetbrains.annotations.Nullable;

public class CompanyConverter extends BasicConverter<Company, DataObjectDTO> {
    @Nullable
    @Override
    public Company transform(@Nullable DataObjectDTO DTO) {
        return null;
    }
}
