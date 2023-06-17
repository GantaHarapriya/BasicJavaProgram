//swaping of two number with out two variables;
package com.tmf.basics;
public class SwapTwoNumber {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("the number before swaping a:"+a);
		System.out.println("the number before swaping b:"+b);

	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("the number after swaping a:"+a);
	  System.out.println("the number after swapnh b:"+b);

	}

}
