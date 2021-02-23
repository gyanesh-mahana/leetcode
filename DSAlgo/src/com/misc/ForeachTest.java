package com.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Amar");
		list.add("Smar");
		list.add("Damar");
		list.add("Gamar");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		//using lambda expression(nameless method)
		//(parameters)->{expressions}
		list.forEach(s->{System.out.println(s);});
		
		//lamba to cut short the code
		list.forEach(System.out::println);
		
		
		
		
	}

}
