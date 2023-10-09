package com.application.errorhandling.domain;

import com.core.domain.ApplicationException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ErrorResponse {
    private final String uniqueId;
    private final String code;

    public ErrorResponse(ApplicationException exception) {
        this.uniqueId = exception.getUniqueId();
        this.code = exception.getErrorCode().toString();
    }
}
