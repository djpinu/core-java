package com.testcore;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(8, "Ram");
//		map.put(5, "Sankar");
//		map.put(1, "Rahul");
//		map.put(9, "Ramesh");
//		map.put(2, "Rohit");
//		map.put(4, "Tushar");
		
		Map<Integer, String> map = new TreeMap<>((a,b)->(b-a));
		map.put(8, "Ram");
		map.put(5, "Sankar");
		map.put(1, "Rahul");
		map.put(9, "Ramesh");
		map.put(2, "Rohit");
		map.put(4, "Tushar");
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey()+"-"+entry.getValue());
		
		
	}

}
