package  com.abid.learning.algorithm;;

public class SortedButRotatedArrayMinelement {

	private static int[] array = { 4, 5, 6, 1, 1, 3 }; // This array is sorted
														// but rotated

	public static void main(String[] args) {
		System.out
				.println("Min element :" + getMinElement(0, array.length - 1));
		System.out.println("Point of rotation : "
				+ getPointOfRotation(0, array.length - 1));
	}

	/* This methods returns min element from a sorted but rotated array */
	public static int getMinElement(int l, int r) {
		if (l > r)
			return array[0];
		if (l == r) {
			return array[l];
		}
		int mid = (l + r) / 2;

		if (mid < r && array[mid + 1] < array[mid]) {
			return array[mid + 1];
		}

		if (mid > l && array[mid] < array[mid - 1]) {
			return array[mid];
		}

		if (array[mid] > array[r]) {
			return getMinElement(mid + 1, r);
		} else {
			return getMinElement(l, mid - 1);
		}

	}

	/*
	 * This methods returns index of min element or pivot point from a sorted
	 * but rotated array
	 */
	public static int getPointOfRotation(int l, int r) {
		if (l > r)
			return 0;
		if (l == r) {
			return l;
		}
		int mid = (l + r) / 2;

		if (mid < r && array[mid + 1] < array[mid]) {
			return mid + 1;
		}

		if (mid > l && array[mid] < array[mid - 1]) {
			return mid;
		}

		if (array[mid] > array[r]) {
			return getMinElement(mid + 1, r);
		} else {
			return getMinElement(l, mid - 1);
		}

	}

}
