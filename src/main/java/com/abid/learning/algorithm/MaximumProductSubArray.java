package  com.abid.learning.algorithm;;

public class MaximumProductSubArray {

	private static int[] array = { -1, -1, -2, -3, 4 };
	private static int start;
	private static int end;
	private static int product;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//findMaxProductSubArray();
		//System.out.println("Max product: " + product + " Start index: " + start
				//+ " End index:" + end);
		//findMaxProduct();
		findMaxSum();
	}

	/**
	 * This method find max product and also start and end index
	 */
	public static void findMaxProductSubArray() {

		for (int i = 0; i < array.length; i++) {
			int tempStart = i;
			int tempEnd = i;
			int tempProduct = array[i];
			if (i == 0) {
				product = array[i];
				start = tempStart;
				end = tempEnd;
			}

			for (int j = i; j < array.length; j++) {

				if (i == j) {
					tempProduct = array[j];
				} else {
					tempProduct = tempProduct * array[j];
				}
				if (tempProduct > product) {
					product = tempProduct;
					tempEnd = j;
					start = tempStart;
					end = tempEnd;

				}
			}
			System.out.println("tempProduct:" + tempProduct + " tempStart:"
					+ tempStart + " tempEnd:" + tempEnd);

		}
	}
	
	public static void findMaxProduct() {
		
		int tmpMax= 1;
		int max= 1;
		
		for (int i = 0; i < array.length; i++) {
			tmpMax= getMax(tmpMax, tmpMax * array[i]);
			
			max = getMax(max, tmpMax);
		}
		
		System.out.println("Max product:"+ max);
	}
	
	public static void findMaxSum() {
		int maxendingHere = array[0];
		int maxSoFar = array[0];
		
		for (int i = 1; i < array.length; i++) {
			maxendingHere= getMax(maxendingHere, maxendingHere + array[i]);
			maxSoFar = getMax(maxendingHere, maxSoFar);
		}
		
		System.out.println("Max Sum:"+ maxSoFar);
	}
	
	private static int getMax(int x, int y){
		return (x > y)? x : y;
	}

}
