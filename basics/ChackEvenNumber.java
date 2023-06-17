package com.tmf.basics;

import java.util.Scanner;

public class ChackEvenNumber {

	public static void main(String[] args) {
		Scanner Scan=new Scanner (System.in);
		System.out.println("Enter The Number:");
		int a=Scan.nextInt();
		if(a%2==0) {
			System.out.println("the number is even");
		}
	}
}
