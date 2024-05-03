package com.project.expensetrackerproject.Exceptions;

public class ExpsenseNotFoundException extends Exception {
    public ExpsenseNotFoundException(String message){
        super(message);
    }
    public ExpsenseNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

}
