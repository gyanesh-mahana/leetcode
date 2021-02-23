package com.misc;

public class RemoveAllOccurrenceOfChar {

	public static String removeAllCharOccurrence(String str, char ch){
		
		str = str.replaceAll(Character.toString(ch), "");
		return str;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = removeAllCharOccurrence("askkjdhfg euyfglwef hdfhjgdkjfhgkjsd", 'k');
		System.out.println(s);
	}

}
