package com.testcore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestInArray {

	public static void main(String[] args) {
		Integer[] num = {5, 3, 8, 2, 9, 3, 5, 10};
		Set<Integer> set = new TreeSet<>(Arrays.asList(num));
		
		List<Integer> list = Arrays.asList(set.toArray(new Integer[0]));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(1));
	}	

}
