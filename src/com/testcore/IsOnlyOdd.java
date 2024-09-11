package com.testcore;

public class IsOnlyOdd {

	public static void main(String[] args) {
		int[] list = {1, 3, 5, 7, 9, 11};
		System.out.println(isOnlyOdd(list));
	}
	static boolean isOnlyOdd(int[] list) {
		for(int i=0;i<list.length;i++) {
			if (list[i]%2==0)
				return false;
				break;
		}
		return true;
	}
}
