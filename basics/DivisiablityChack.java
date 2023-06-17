package com.tmf.basics;

import java.util.Scanner;

public class DivisiablityChack {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("enter your first number a:");
		System.out.println("enter your second  number b:");
		int a=Scan.nextInt();
		int b=Scan.nextInt();
		if(a%b==0) {
		
System.out.println(" the 1st number is divisible by second number");
	}
		else {
			System.out.println("the number is not divisible");

}
}
}