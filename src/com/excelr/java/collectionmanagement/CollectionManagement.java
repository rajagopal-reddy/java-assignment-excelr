package com.excelr.java.collectionmanagement;

import java.util.*;

public class CollectionManagement {
    private static final List<Integer> userList = new ArrayList<>();
    private static final Set<String> userSet = new HashSet<>();
    private static final Map<Integer,String> userMap = new HashMap<>();

    static {
        userList.addAll(Arrays.asList(1, 2, 3, 4, 5, null, 7));

        userSet.add("Gopal");
        userSet.add("Rohan");
        userSet.add("Lina");
        userSet.add("Rose");
        userSet.add("Gopal");

        userMap.put(1, "Hero");
        userMap.put(2, "Gopal");
        userMap.put(2,"John");
        userMap.put(3, "Vital");
        userMap.put(4, null);
        userMap.put(null,null);
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
            System.out.println("1. Add User ID");
            System.out.println("2. Remove User ID");
            System.out.println("3. Display All Users ID");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (userList.contains(id)) {
                        System.out.println("User ID already exists in the list.");
                    } else {
                        userList.add(id);
                        System.out.println("User ID added successfully!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter User ID to remove: ");
                    int id = scanner.nextInt();
                    boolean removed = userList.remove(Integer.valueOf(id));
                    if (removed) {
                        System.out.println("User ID removed successfully!");
                    } else {
                        System.out.println("User with ID " + id + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all users:");
                    userList.forEach(System.out::println);
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
            System.out.println("1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Display All Names");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Name to Add: ");
                    String name = scanner.nextLine();
                    boolean added = userSet.add(name);
                    if (added) {
                        System.out.println("Name added successfully!");
                    } else {
                        System.out.println("Name already exists in the set.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Name to Remove: ");
                    String name = scanner.nextLine();
                    boolean removed = userSet.remove(name);
                    if (removed) {
                        System.out.println("Name removed successfully!");
                    } else {
                        System.out.println("Name not found in the set.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all names:");
                    userSet.forEach(System.out::println);
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
            System.out.println("1. Add User ID and Name");
            System.out.println("2. Remove User by ID");
            System.out.println("3. Display All Users");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter User ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();

                    if (id == 0 || name == null || name.isEmpty()) {
                        System.out.println("Invalid input. ID or name cannot be null or empty.");
                    } else if (userMap.containsKey(id)) {
                        System.out.println("ID already exists. Updating the name for ID " + id);
                        userMap.put(id, name);
                    } else {
                        userMap.put(id, name);
                        System.out.println("User added successfully!");
                    }
                }

                case 2 -> {
                    System.out.print("Enter User ID to Remove: ");
                    int id = scanner.nextInt();

                    if (userMap.containsKey(id)) {
                        userMap.remove(id);
                        System.out.println("User with ID " + id + " removed successfully!");
                    } else {
                        System.out.println("User with ID " + id + " not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Displaying all users:");
                    userMap.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
