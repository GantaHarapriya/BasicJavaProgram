package com.tmf.basics;

import java.util.Scanner;

public class Fectors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no for which you what factor:");
	int a =scan.nextInt();
for(int i=1;i<=a;i++){
	if(a%i==0) {
		System.out.println(+i);
	}
		
}
}
}