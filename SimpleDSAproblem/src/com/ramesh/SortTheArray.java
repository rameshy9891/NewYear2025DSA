package com.ramesh;

import java.util.Scanner;

public class SortTheArray {

    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
