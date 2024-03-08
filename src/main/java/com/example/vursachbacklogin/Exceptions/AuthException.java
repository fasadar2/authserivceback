package com.example.vursachbacklogin.Exceptions;

public class AuthException extends Exception{
    public AuthException(){
        super("Password not found");
    }
}
