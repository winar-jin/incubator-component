package com.winar.exception;

import org.springframework.http.HttpStatus;

/**
 * @author Winar
 * Created on 2022-06-13
 */
public class ServiceException extends AbstractException {
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
