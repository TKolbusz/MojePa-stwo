package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.model.Person;
import com.tkolbusz.domain.util.BasicConverter;
import com.tkolbusz.provider.dto.PersonDTO;

import org.jetbrains.annotations.Nullable;

class PersonConverter extends BasicConverter<Person, PersonDTO> {
    @Nullable
    @Override
    public Person transform(@Nullable PersonDTO DTO) {
        if (DTO == null) {
            return null;
        }
        return new Person(
                DTO.getNazwa()
        );
    }
}
