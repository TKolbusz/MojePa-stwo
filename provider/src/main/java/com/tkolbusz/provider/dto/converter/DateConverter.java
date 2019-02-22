package com.tkolbusz.provider.dto.converter;

import com.tkolbusz.domain.util.BasicConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConverter extends BasicConverter<Date, String> {
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    @Override
    public Date transform(String DTO) {
        if (DTO == null) {
            return null;
        }
        try {
            return SDF.parse(DTO);
        } catch (ParseException e) {
            return null;
        }
    }
}
