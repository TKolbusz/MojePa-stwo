package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.CompanySmall;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.CompanyDTO;
import com.tkolbusz.provider.dto.DataObjectDTO;

public class CompanySmallConverter extends BasicConverter<CompanySmall, DataObjectDTO> {
    @Override
    public CompanySmall transform(DataObjectDTO DTO) {
        if (DTO == null) {
            return null;
        }
        CompanyDTO companyDTO = DTO.getDataDTO();
        if (companyDTO == null) return null;
        return new CompanySmall(
                DTO.getId(),
                companyDTO.getKrsPodmiotyNazwaSkrocona(),
                companyDTO.getKrsPodmiotyFormaPrawnaStr(),
                new AddressConverter().transform(companyDTO),
                companyDTO.getKrsPodmiotyKrs(),
                new DateConverter().transform(companyDTO.getKrsPodmiotyDataRejestracji())
        );
    }
}
