package com.tmf.basics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Scan.nextInt();
		if(n%2==0) {
			System.out.println("the number is Even");
		}
		else {
			System.out.println("the number is odd");
		}
	}

}
