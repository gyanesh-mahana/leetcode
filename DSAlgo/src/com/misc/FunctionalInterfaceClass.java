package com.misc;

public class FunctionalInterfaceClass /* implements FunctionalInterfaceTest */ { // normal approach

	// normal approach
//	public void method() {
//		System.out.println("Overriding Interface method...");
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiation of Functional Interface using lambda expression
		FunctionalInterfaceTest fic = () -> {
			System.out.println("Functional Interface Method Instantiated");
		};
		fic.method();
	}

}
