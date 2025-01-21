package com.ramesh;

import java.util.Scanner;

public class PatternN {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
