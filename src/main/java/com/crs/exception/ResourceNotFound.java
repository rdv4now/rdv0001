package com.crs.exception;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String msg){
        super(msg);
    }
}
