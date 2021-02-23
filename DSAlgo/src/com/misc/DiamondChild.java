/*
 * 29. Write a Program to Show Diamond Problem with Multiple Inheritance?
 */

package com.misc;


public class DiamondChild extends DiamondParent1/*,DiamondParent2*/{	//compilation error:unresolved compilationissue

	public void childMethod() {
		super.interfaceMethod();
		super.interfaceMethodDefault();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondChild dc = new DiamondChild();
		dc.childMethod();
		DiamondProblemInterface.interfaceMethodStatic();

	}

}
