package com.abid.learning.algorithm.string;

public class Palindrom {

	public static boolean isPalindrom(String string) {

		int left = 0;
		int right = string.length() - 1;
		while (left < right) {
			if (string.charAt(left) == string.charAt(right)) {
				left++;
				right--;
			} else {
				return Boolean.FALSE;
			}
		}// end of while

		return Boolean.TRUE;

	}
}
