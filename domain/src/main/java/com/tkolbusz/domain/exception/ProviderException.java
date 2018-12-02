package com.tkolbusz.domain.exception;

public class ProviderException extends Exception {
    private final int code;

    public ProviderException(String errorMessage, int code) {
        super(errorMessage);
        this.code = code;
    }
}
