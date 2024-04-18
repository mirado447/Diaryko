package com.journal.diaryko.model.exception;

import static com.journal.diaryko.model.exception.ApiException.ExceptionType.CLIENT_EXCEPTION;
public class NotFoundException extends ApiException{
    public NotFoundException(String message){super(CLIENT_EXCEPTION, message);}
}
