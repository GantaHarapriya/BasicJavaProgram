package com.tmf.basics;

import java.util.Scanner;

public class ChackOddNumber {

	public static void main(String[] args) {
	Scanner Scan= new Scanner(System.in);
	System.out.println("enter the number :");
	int a=Scan.nextInt();
	if(a%2!=0) {
		System.out.println("number is odd");
	}
	}

}
