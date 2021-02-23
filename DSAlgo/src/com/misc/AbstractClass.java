package com.misc;

public abstract class AbstractClass {

	public abstract void method1();
	public void method2() {
		System.out.println("I am not abstract method");
	}
	
	protected void pMethod() {
//		this.sMethod();
		AbstractClass.sMethod();
		System.out.println("I am protected method");
	}
	
	private static void sMethod() {
		System.out.println("private static method");
	}
	
	public static void psMethod() {
		System.out.println("public static method");
	}
	 
//	public void psMethod();

}
