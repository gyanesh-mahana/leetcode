package com.misc;

public class OverloadingAndOverridingClass extends AbstractClass {

	public void method1() {
		System.out.println("Overriding Abstract method");
	}
	
	public void oMethod() {
		System.out.println("oMethod without args");
	}
	public void oMethod(int o) {
		System.out.println("oMethod with args="+o);
	}
	
	public static void main() {
		System.out.println("main() overloaded");
	}
	public static void main(String[] str) {
		OverloadingAndOverridingClass oaoc = new OverloadingAndOverridingClass();
		oaoc.method1();
		oaoc.method2();
		oaoc.oMethod();
		oaoc.oMethod(4);
//		AbstractClass.sMethod();
		AbstractClass ac =new OverloadingAndOverridingClass();
		ac.pMethod();
		AbstractClass.psMethod();
		main();
	}
}
