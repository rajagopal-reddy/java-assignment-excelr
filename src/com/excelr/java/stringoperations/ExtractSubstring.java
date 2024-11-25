package com.excelr.java.stringoperations;

import java.util.Scanner;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        StringBuilder sub = new StringBuilder();

        for(int i = start; i< end; i++){
            sub.append(a.charAt(i));
        }

        System.out.println("Substring of " + a +" from index " + start + " to " + end + " is " + sub );


    }
}
