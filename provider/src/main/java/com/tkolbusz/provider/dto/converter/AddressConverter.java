package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Address;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.CompanyDTO;

public class AddressConverter extends BasicConverter<Address, CompanyDTO> {
    @Override
    public Address transform(CompanyDTO DTO) {
        if (DTO == null) return null;
        return new Address(
                DTO.getKrsPodmiotyAdresUlica(),
                DTO.getKrsPodmiotyAdresNumer(),
                DTO.getKrsPodmiotyAdresMiejscowosc(),
                DTO.getKrsPodmiotyAdresKraj(),
                DTO.getKrsPodmiotyAdresKodPocztowy()
        );
    }
}
