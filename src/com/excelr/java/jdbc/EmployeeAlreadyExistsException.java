package com.excelr.java.jdbc;

public class EmployeeAlreadyExistsException extends RuntimeException{
    EmployeeAlreadyExistsException (String message){
        super(message);
    }
}
