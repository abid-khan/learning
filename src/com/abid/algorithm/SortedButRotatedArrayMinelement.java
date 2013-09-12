package com.abid.algorithm;

public class SortedButRotatedArrayMinelement {

	private static int[] array = { 4, 5, 6, 1, 2, 3 }; // This array is sorted
														// but rotated at index
														// 3

	public static void main(String[] args) {
		System.out.println(getMinElement(0, array.length - 1));
	}

	public static int getMinElement(int l, int r) {
		if (l > r)
			return array[0];
		if (l == r) {
			return array[l];
		}
		int mid = (l + r) / 2;
		if (mid > l && array[mid] < array[mid - 1]) {
			return array[mid];
		}

		if (array[mid] > array[r]) {
			return getMinElement(mid + 1, r);
		} else {
			return getMinElement(l, mid - 1);
		}

	}
	
	public void testOne(){
		
	}
}
