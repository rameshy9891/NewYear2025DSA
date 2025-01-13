package com.ramesh;

import java.util.Scanner;

public class ArrayLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Take input for the array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("\nThe elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
