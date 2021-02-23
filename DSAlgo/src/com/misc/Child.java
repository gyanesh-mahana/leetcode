package com.misc;

public class Child extends ShowInheritanceParent {

	public void childMethod() {
		System.out.println("I am the child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.parentMethod();
		c.childMethod();

	}

}
