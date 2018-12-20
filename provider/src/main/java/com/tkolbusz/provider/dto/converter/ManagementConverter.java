package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Management;
import com.tkolbusz.domain.model.Position;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.ManagementDTO;

import org.jetbrains.annotations.Nullable;

class ManagementConverter extends BasicConverter<Management, ManagementDTO> {
    @Nullable
    @Override
    public Management transform(@Nullable ManagementDTO DTO) {
        if (DTO == null) {
            return null;
        }
        return new Management(
                DTO.getNazwa(),
                // valueOf not working
                Position.find(DTO.getFunkcja())
        );
    }
}
