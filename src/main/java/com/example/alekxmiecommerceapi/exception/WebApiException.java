package com.example.alekxmiecommerceapi.exception;

import lombok.Getter;

@Getter
public class WebApiException extends RuntimeException {
    private final WebApiExceptionType webApiExceptionType;

    public WebApiException(WebApiExceptionType webApiExceptionType) {
        this.webApiExceptionType = webApiExceptionType;
    }
}
