package com.tmf.basics;

import java.util.Scanner;

public class AddEvenOrOddNumber {
  public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=Scan.nextInt();
	System.out.println("enter the last number");
	int b=Scan.nextInt();
	int evensum=0;
	int oddsum=0;
	int difference=0;
	for(int i=a;i<=b;i++) {
		if (i%2==0) {
	     evensum +=i;	
	}
		else {
			oddsum+=i;
		}
	difference=evensum-oddsum;
	}
	System.out.println("the sum of even number is:"+evensum);
	System.out.println("the sum of odd number is :"+oddsum);
	System.out.println("the difference between the even  and odd:"+difference);
}
}