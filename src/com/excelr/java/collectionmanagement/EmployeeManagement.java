package com.excelr.java.collectionmanagement;

import java.util.*;

class Employee{
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeManagement {

    private static final List<Employee> empList = new ArrayList<>();
    private static final Set<Employee> empSet = new HashSet<>();
    private static final Map<Integer,Employee> empMap = new HashMap<>();

    static {
        empList.add(new Employee(101,"Gopal","Developer",40000));
        empList.add(new Employee(102,"Don","Testing",30000));
        empList.add(new Employee(103,"Kiki","Developer",55000));
        empList.add(new Employee(104,"Alice", "HR", 11000));
        empList.add(new Employee(105,"Bob", "Design", 9000));
        empList.add(new Employee(106,"Paul","HR",70000));

        empSet.add(new Employee(101,"Gopal","Developer",40000));
        empSet.add(new Employee(102,"Don","Testing",30000));
        empSet.add(new Employee(103,"Kiki","Developer",55000));
        empSet.add(new Employee(104,"Alice", "HR", 11000));
        empSet.add(new Employee(105,"Bob", "Design", 9000));
        empSet.add(new Employee(106,"Paul","HR",70000));

        empMap.put(101,new Employee(101,"Gopal","Developer",40000));
        empMap.put(102,new Employee(102,"Don","Testing",30000));
        empMap.put(103,new Employee(103,"Kiki","Developer",55000));
        empMap.put(104,new Employee(104,"Alice", "HR", 11000));
        empMap.put(105,new Employee(105,"Bob", "Design", 90000));
        empMap.put(106,new Employee(106,"Paul","HR",70000));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("--- Collection Management ---");
            System.out.println("1. Manage List");
            System.out.println("2. Manage Set");
            System.out.println("3. Manage Map");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> manageList(scanner);
                case 2 -> manageSet(scanner);
                case 3 -> manageMap(scanner);
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageList(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("--- List Operations ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    empList.add(new Employee(id, name, department, salary));
                    System.out.println("Employee added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = scanner.nextInt();
                    boolean removed = empList.removeIf(emp -> emp.id == id);
                    if (removed) {
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all employees:");
                    empList.forEach(System.out::println);
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageSet(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("--- Set Operations ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    empSet.add(new Employee(id, name, department, salary));
                    System.out.println("Employee added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = scanner.nextInt();
                    boolean removed = empSet.removeIf(emp -> emp.id == id);
                    if (removed) {
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all employees:");
                    empSet.forEach(System.out::println);
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageMap(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("--- Map Operations ---");
            System.out.println("1. Add/Update Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    empMap.put(id, new Employee(id, name, department, salary));
                    System.out.println("Employee added/updated successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = scanner.nextInt();
                    if (empMap.containsKey(id)) {
                        empMap.remove(id);
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all employees:");
                    empMap.forEach((id, emp) -> System.out.println("ID: " + id + ", " + emp));
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}