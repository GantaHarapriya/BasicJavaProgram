package com.tmf.basics;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
	    System.out.println("enter the for which u neeed factorial:");
	    int  a=Scan.nextInt();
	    int b=1;
	    for( int i=1;i<=a;i++) {
	    	b*=i;
	    }
	    System.out.println("the factorial of the number is :"+b);
	}

}
