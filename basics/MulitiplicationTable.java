package com.tmf.basics;

import java.util.Scanner;

public class MulitiplicationTable {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the number for table:");
        int a=Scan.nextInt();
        for(int i=1;i<=10;i++) {
		System.out.println(a+"*"+i+"="+(a*i));
        }
	}

}
