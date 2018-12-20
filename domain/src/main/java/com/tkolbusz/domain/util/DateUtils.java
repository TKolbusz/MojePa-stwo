package com.tkolbusz.domain.util;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
    private static final SimpleDateFormat registerSDF = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());

    public static String formatRegisterDate(@NotNull Date date) {
        return registerSDF.format(date);
    }
}