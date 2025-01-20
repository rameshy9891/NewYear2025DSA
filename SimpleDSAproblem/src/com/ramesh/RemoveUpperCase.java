package com.ramesh;

import java.util.Scanner;

public class RemoveUpperCase {

    // ex- ramEsH --> rams

    public static void main(String[] args) {
        System.out.println("Enter the input string: ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        // Use StringBuilder to build the resulting string
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            // Check if the character is not uppercase
            if (!Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }

        // Print the resulting string
        System.out.println("String after removing uppercase letters: " + result.toString());
    }
}
