package com.ramesh;

import java.util.Scanner;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the length of row");
		
		Scanner sc= new Scanner(System.in);
		
		int row= sc.nextInt();
		
		System.out.println("enter the length of colum");
		
		int col= sc.nextInt();
		
		int[][] array= new int[row][col];
		
		System.out.println("enter the row and col value");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(array[i][j]);
			}
		}
		
		

	}

}
