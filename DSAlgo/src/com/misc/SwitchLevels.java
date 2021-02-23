/*
 * 34. Show example of switch expressions and multi-label case statements
 */

package com.misc;

public class SwitchLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = args[0];
		switch (key) {
		case "y":
			System.out.println("Key is : " + key);
			break;

		case "n":
			System.out.println("Key is : " + key);
			break;
		default:
			System.out.println("Wrong Key is Entered");
			System.out.println("Valid Keys: [y/n]");
			break;
		}

		// preview feature in JAVA 12
		// standard gfeature in JAVA 14
//		int choice=3;
//		
//		int x = switch(choice){
//		
//		case 1,2,3:
//			yield choice;
//		default:
//			yield -1
//		};

	}

}
