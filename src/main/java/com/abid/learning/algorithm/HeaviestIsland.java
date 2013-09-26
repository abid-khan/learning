package com.abid.learning.algorithm;

import com.abid.learning.datastructure.Stack;

public class HeaviestIsland {

	private static int[][] islands = { { 1, 0, 0, 0 }, { 1, 0, 1, 2 },
			{ 2, 1, 0, 2 }, { 0, 0, 0, 1 } };

	private static Stack<Index> stack = new Stack<Index>();

	private static int weight = 0;
	private static String path = "";

	public static void main(String[] args) {
		fillIslands();
		System.out.println("Heaviest Island :" + path);
	}

	public static void fillIslands() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Index index = new Index(i, j);
				stack.push(index);
				String tempPath = "";
				int tempWeight = 0;
				while (!stack.isEmpty()) {
					index = stack.pop();
					if (islands[index.getRow()][index.getCol()] > 0) {
						tempPath = tempPath + "[" + index.getRow() + "]["
								+ index.getCol() + "]";
						tempWeight = tempWeight
								+ islands[index.getRow()][index.getCol()];

						if (index.getRow() + 1 < 4) {
							stack.push(new Index(index.getRow() + 1, index
									.getCol()));
						}

						if (index.getCol() + 1 < 4) {
							stack.push(new Index(index.getRow(),
									index.getCol() + 1));
						}

					}

				}

				System.out.println("Path : " + tempPath + " Temp Wight :"
						+ tempWeight);

				if (weight == 0 || tempWeight > weight) {
					path = tempPath;
					weight = tempWeight;
				}

			}
		}
	}
}
