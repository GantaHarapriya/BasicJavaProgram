package com.tmf.basics;

import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=Scan.nextInt();
		System.out.println("enter the end  number");
		int b=Scan.nextInt();
		for(int i = a;i<=b;i++) {
			if(i%2==0) {
			System.out.println(i);
			
		}
	}

}
}
