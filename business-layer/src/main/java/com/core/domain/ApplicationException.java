package com.core.domain;

import lombok.Getter;

import java.util.UUID;

@Getter
public class ApplicationException extends RuntimeException {
    private final String uniqueId = UUID.randomUUID().toString();
    private final ErrorCodeEnum errorCode;

    public ApplicationException(ErrorCodeEnum errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApplicationException(ErrorCodeEnum errorCode, String message, Throwable t) {
        super(message, t);
        this.errorCode = errorCode;
    }

}
