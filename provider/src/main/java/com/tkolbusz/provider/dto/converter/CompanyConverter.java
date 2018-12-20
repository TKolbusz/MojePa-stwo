package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.CompanyDTO;
import com.tkolbusz.provider.dto.DataObjectDTO;
import com.tkolbusz.provider.dto.LayersDTO;

import org.jetbrains.annotations.Nullable;

import java.util.Collections;

public class CompanyConverter extends BasicConverter<Company, DataObjectDTO> {
    @Nullable
    @Override
    public Company transform(@Nullable DataObjectDTO DTO) {
        CompanySmall companySmall = new CompanySmallConverter().transform(DTO);
        if (companySmall == null || DTO == null || DTO.getDataDTO() == null) return null;

        CompanyDTO companyDTO = DTO.getDataDTO();

        LayersDTO layers = DTO.getLayers();

        return new Company(
                companySmall,
                companyDTO.getKrsPodmiotyRegon(),
                new MoneyConverter().transform(companyDTO.getKrsPodmiotyWartoscKapitalZakladowy()),
                layers != null ? new ManagementConverter().transform(layers.getReprezentacja()) : Collections.emptyList(),
                layers != null ? new ShareholderConverter().transform(layers.getWspolnicy()) : Collections.emptyList(),
                companyDTO.getKrsPodmiotyNip()
        );
    }
}