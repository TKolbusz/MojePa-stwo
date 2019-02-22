package com.tkolbusz.domain.util;

import org.jetbrains.annotations.NotNull;

public interface Supplier<T> {
    @NotNull
    T get();
}
