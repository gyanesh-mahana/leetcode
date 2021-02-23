/*
 * HashMap is not an ordered collection. So, sorting its entries doesn’t make any sense. 
 * But, we can sort the entries based on value and store into LinkedHashMap. 
 * LinkedHashMap maintains the order of insertion.
 */

package com.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static Map<String, Integer> sortHashMapByValue(Map<String, Integer> hmap) {

		// creating new result map as linkedHashMap
		// LinkedHashMap is ordered
		Map<String, Integer> resMap = new LinkedHashMap<String, Integer>();
		// Set is unordered
		Set<Entry<String, Integer>> entrySet = hmap.entrySet();
		System.out.println(entrySet);

		// List is ordered
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(entrySet);

		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(entryList);

		for (Entry<String, Integer> e : entryList) {
			resMap.put(e.getKey(), e.getValue());
		}

		return resMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("z", 26);
		map.put("o", 15);
		map.put("s", 19);
		map.put("c", 3);
		System.out.println(map);
		System.out.println(sortHashMapByValue(map));
	}

}
