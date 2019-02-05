package com.tkolbusz.domain.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicConverter<M, DTO> {
    @Nullable
    public abstract M transform(@Nullable DTO DTO);

    @NotNull
    public List<M> transform(@Nullable List<DTO> DTOs) {
        List<M> list = new ArrayList<>();
        if (DTOs != null) for (DTO dto : DTOs) {
            M model = transform(dto);
            if (model != null)
                list.add(model);
        }
        return list;
    }
}