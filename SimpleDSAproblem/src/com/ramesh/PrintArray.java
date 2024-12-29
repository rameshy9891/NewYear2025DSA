package com.ramesh;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter length of Array");
		
		Scanner sc= new Scanner(System.in);
		
		int length= sc.nextInt();
		
		int[] array= new int[length];
		
		System.out.println("please enter the array");
		
		for(int i=0; i<length; i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("using println");
		
		for(int i=0; i<length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("using print only");
		for(int i=0; i<length; i++) {
			System.out.print(array[i]+" ");
		}
		
		sc.close();

	}

}
