/*
 * 2. How to swap two numbers without using a third variable?
 */

package com.misc;

public class SwapTwoNumbers {

	public void swapNums(int num1, int num2) {
		//n1=10, n2=20
		//step1: add both to first
		//n1=30
		//n2=n1-n2=10
		//n1=n1-n2=20
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 = "+num1+" num2="+num2);
	}
	
	public void swapNumsV2(Integer num1, Integer num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 = "+num1+" num2="+num2);
	}
	public static void main(String[] str) {
	
		SwapTwoNumbers stn = new SwapTwoNumbers();
		int num1=10, num2=23;
		stn.swapNums(num1, num2);
		//no change as the values are primitive and java is 
		//pass by value, also java cannot return two values
		System.out.println("num1 = "+num1+" num2="+num2);
		Integer n1=12, n2=79;
		stn.swapNumsV2(n1, n2);
		System.out.println("num1 = "+n1+" num2="+n2);
	}
}
