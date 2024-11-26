package com.excelr.java.jdbc;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException (String message){
        super(message);
    }
}
