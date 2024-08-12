package com.testcore;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] array = {1, 4, 2, 7, 0, 4, 9};
		sort(array);

	}
	static void sort(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
