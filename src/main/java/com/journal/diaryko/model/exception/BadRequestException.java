package com.journal.diaryko.model.exception;

import static com.journal.diaryko.model.exception.ApiException.ExceptionType.CLIENT_EXCEPTION;
public class BadRequestException extends ApiException{
    public BadRequestException(String message){
        super(CLIENT_EXCEPTION,message);
    }
}
