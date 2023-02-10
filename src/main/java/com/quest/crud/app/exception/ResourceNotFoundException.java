package com.quest.crud.app.exception;

public class ResourceNotFoundException extends RuntimeException{


    public  ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
