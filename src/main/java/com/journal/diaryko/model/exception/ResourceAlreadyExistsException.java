package com.journal.diaryko.model.exception;

import static com.journal.diaryko.model.exception.ApiException.ExceptionType.CLIENT_EXCEPTION;
public class ResourceAlreadyExistsException extends ApiException{
    public ResourceAlreadyExistsException(String message) {super(CLIENT_EXCEPTION, message);}
}
