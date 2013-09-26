package com.abid.datastructure;

import java.util.Arrays;

public class Stack<E> {

	private static final int DEFAULT_SIZE = 10;
	private int size = 0;
	Object[] elements;

	public Stack() {
		elements = new Object[DEFAULT_SIZE];
	}

	public void push(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = e;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E e = (E) elements[--size];
		elements[size] = null;
		return e;
	}

	public void ensureCapacity() {
		elements = Arrays.copyOf(elements, elements.length * 2);
	}

	public int length() {
		return elements.length;
	}

	public boolean isEmpty() {
		return (size > 0) ? Boolean.FALSE : Boolean.TRUE;
	}
}
