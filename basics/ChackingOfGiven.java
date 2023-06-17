package com.tmf.basics;
import java.util.Scanner;

public class ChackingOfGiven {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Scan.nextInt();
		if(n>0) {
		System.out.print("the number is positive");
		}
		else if(n<0) {
		System.out.print("the number is negative");
	}
		else {
		System.out.print("the number is zero");	
	}
}
}