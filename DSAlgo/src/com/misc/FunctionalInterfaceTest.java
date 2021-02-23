/*
 * 39. How do we create a Functional interface?
 * 
 * The major benefit of java 8 functional interfaces is that 
 * we can use lambda expressions to instantiate them and 
 * avoid using bulky anonymous class implementation.
 */

package com.misc;

@FunctionalInterface
public interface FunctionalInterfaceTest {
	void method();
	
	public static void main(String[] str) {
		System.out.println("Functional Interface");
	}
}
