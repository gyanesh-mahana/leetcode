/*
 * 29. Write a Program to Show Diamond Problem with Multiple Inheritance?
 * 
 * 38. Write an interface with default and static method?
 */

package com.misc;

public interface DiamondProblemInterface {
	//only public static and final are allowed
//	private int a =0;
	public static int diamondInt=0;
	public void interfaceMethod();
	void interfaceMethodDefault();
	
	//static method need a body
	static void interfaceMethodStatic() {
		System.out.println("Interface static method");
	}

}
