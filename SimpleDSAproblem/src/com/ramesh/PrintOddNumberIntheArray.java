package com.ramesh;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintOddNumberIntheArray {
	
	public static void main(String[] args) {
		
		System.out.println("enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int length=sc.nextInt();
		
		System.out.println("enter the array");
		
		int[] arr= new int[length];
		
		for(int i=0; i<length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		//input taking part completed 
		
		ArrayList<Integer> arr2= new ArrayList<>();
		
		for(int j=0; j<length; j++) {
			if(arr[j]%2==1) {
				arr2.add(arr[j]);
			}
			
		}
		System.out.println("one methode of printing ArrayList");
		for(int i=0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		
		System.out.println("Second method of printing ArrayList");
		for(int num: arr2) {
			System.out.println(num);
		}
	}

}
