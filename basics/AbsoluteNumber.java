package com.tmf.basics;

import java.util.Scanner;

public class AbsoluteNumber {
	public static void main(String[] args) {
    try (Scanner Scanner = new java.util.Scanner(System.in)) {
		System.out.print("enter the number");
		int n=Scanner.nextInt();
		 int AbsoulteValue=Math.abs(n);
		 System.out.println("the absolute value of the number:" +AbsoulteValue);
	}
	}
	}
