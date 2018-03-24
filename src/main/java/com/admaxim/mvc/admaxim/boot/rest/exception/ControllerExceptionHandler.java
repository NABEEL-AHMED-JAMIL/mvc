package com.admaxim.mvc.admaxim.boot.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    @ExceptionHandler(CustomerNotFoundException.class)
    public void handleNotFound(CustomerNotFoundException ex) {
        System.out.println("Resource not found");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) // 400
    @ExceptionHandler(InvalidCustomerRequestException.class)
    public void handleBadRequest(InvalidCustomerRequestException ex) {
        System.out.println("Invalid Fund Request");
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {
        System.out.println("An error occurred procesing request" + ex);
    }
}