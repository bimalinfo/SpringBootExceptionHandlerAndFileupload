package com.example.filedemo.another.exceptionhandler;

public class AgeInvalidException extends RuntimeException
{
    public AgeInvalidException(String exception) {
        super(exception);
    }

}
