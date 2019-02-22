package com.tkolbusz.domain.util;

import org.jetbrains.annotations.NotNull;

public interface Function<T, R> {
    @NotNull
    R apply(@NotNull T t);
}
