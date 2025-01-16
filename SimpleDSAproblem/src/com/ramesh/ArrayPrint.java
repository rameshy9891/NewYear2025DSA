package com.ramesh;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("take the input");
		
		Scanner sc= new Scanner(System.in);
		
		int length= sc.nextInt();
		
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<length; i++) {
			System.out.println(arr[i]);
		}

	}

}
