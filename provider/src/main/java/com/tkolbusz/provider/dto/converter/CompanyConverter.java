package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Company;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.CompanyDTO;
import com.tkolbusz.provider.dto.DataObjectDTO;

import java.util.Collections;

public class CompanyConverter extends BasicConverter<Company, DataObjectDTO> {
    @Override
    public Company transform(DataObjectDTO DTO) {
        if (DTO == null) {
            return null;
        }
        CompanyDTO companyDTO = DTO.getDataDTO();
        return new Company(
                companyDTO.getKrsPodmiotyNazwa(),
                companyDTO.getKrsPodmiotyNumerWpisu(),
                companyDTO.getKrsPodmiotyRegon(),
                new DateMapper().transform(companyDTO.getKrsPodmiotyDataRejestracji()),
                new MoneyConverter().transform(companyDTO.getKrsPodmiotyWartoscKapitalZakladowy()),
                new AddressConverter().transform(companyDTO),
                Collections.emptyList()
        );
    }
}
