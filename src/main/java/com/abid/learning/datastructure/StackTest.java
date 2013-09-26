package com.abid.datastructure;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Length :" + stack.length());
		stack.push(1);
		System.out.println("Length :" + stack.pop());
		System.out.println("Length :" + stack.length());
	}

}
