package com.tkolbusz.provider.dto.converter;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DateConverterTest {
    @Test
    public void map() {
        String dateString = "2016-09-20";
        Date date = new DateConverter().transform(dateString);
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        assertEquals(LocalDate.of(2016, Month.SEPTEMBER, 20), localDate);
    }
}