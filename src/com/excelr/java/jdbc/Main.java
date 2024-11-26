package com.excelr.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = EmployeeJDBC.getConnection()) {
            EmployeeDao employeeDao = new EmployeeDao(connection);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Employee");
                System.out.println("2. Get Employee by ID");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. View All Employees");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Department: ");
                        String department = scanner.next();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        Employee employee = new Employee(id, name, department, salary);
                        try {
                            employeeDao.addEmployee(employee);
                            System.out.println("Employee added successfully.");
                        } catch (EmployeeAlreadyExistsException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        try {
                            Employee employee = employeeDao.getEmployeeById(id);
                            System.out.println(employee);
                        } catch (EmployeeNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Department: ");
                        String department = scanner.next();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        Employee employee = new Employee(id, name, department, salary);
                        try {
                            employeeDao.updateEmployee(employee);
                            System.out.println("Employee updated successfully.");
                        } catch (EmployeeNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        try {
                            employeeDao.deleteEmployee(id);
                            System.out.println("Employee deleted successfully.");
                        } catch (EmployeeNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 5 -> {
                        employeeDao.getAllEmployees().forEach(System.out::println);
                    }
                    case 6 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

