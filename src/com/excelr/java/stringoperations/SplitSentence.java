package com.excelr.java.stringoperations;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String [] arr = a.trim().split(" ");
        for(String s :arr){
            System.out.println(s);
        }
    }
}
