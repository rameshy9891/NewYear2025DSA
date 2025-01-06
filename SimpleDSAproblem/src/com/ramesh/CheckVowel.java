package com.ramesh;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("Enter the input string in which you want to check vowels:");

        Scanner sc = new Scanner(System.in);

        // Read the input string and convert it to lowercase
        String str = sc.nextLine().toLowerCase();

        // Convert the string to a character array
        char[] str2 = str.toCharArray();

        boolean allVowels = true; // To check if all characters are vowels

        // Iterate through the character array
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] != 'a' && str2[i] != 'e' && str2[i] != 'i' && str2[i] != 'o' && str2[i] != 'u') {
                allVowels = false;
                System.out.println("Not all characters are vowels.");
                break;
            }
        }

        // If all characters are vowels, print the result
        if (allVowels) {
            System.out.println("The whole string contains only vowels.");
        }

        sc.close();
    }
}
