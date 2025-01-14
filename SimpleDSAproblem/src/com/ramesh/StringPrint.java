package com.ramesh;

import java.util.Scanner;

public class StringPrint {
	
	 public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Print the entered string
	        System.out.println("You entered: " + inputString);

	        // Close the scanner
	        scanner.close();
	    }

}
