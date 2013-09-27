package com.abid.learning.designpattern.creation.singleton;

public class Singleton implements Cloneable {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException("This class in a singleton");
	}

}
