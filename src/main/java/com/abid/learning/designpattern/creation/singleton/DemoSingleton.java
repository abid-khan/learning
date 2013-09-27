package com.abid.learning.designpattern.creation.singleton;

public class DemoSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();

		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);

	}

}
