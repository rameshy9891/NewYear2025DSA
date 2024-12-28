package com.ramesh;

import java.util.Scanner;

public class FindSumOfMultiples {
	
	public static void main(String[] args) {
		
		//Output Explanation:
		/*For the simple input , n=3 , k=10 and y =5
		 * first k multiple of n are first 10 multiples of 3 ):- 3 6 9 12 15 18 21 24 27 30
		 * number from above which are visible by y(i.e 5) are:- 15,30
		 * sum of numbers divisible by 15 and 30 is 15+30=45*/
		System.out.println("take three inputs furst number which you want multiplication");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
	   System.out.println("from when you want multiplication");
	   int num2= sc.nextInt();
	   System.out.println("write number here which you want mode of that number sum");
	   int num3= sc.nextInt();
	   
	   int sum=0;
	   int multi=0;
	   
	   for(int i=1; i<=num2; i++) {
		   multi=num1*i;
		   if(multi%num3==0) {
			   sum=sum+multi;
		   }
	   }
	   
	   System.out.println(sum);
	   sc.close();
	}

}
