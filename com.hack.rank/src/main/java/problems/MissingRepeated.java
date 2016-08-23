package problems;

public class MissingRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 2, 5, 3};
		//int arr[] = {1 ,9 ,2, 3, 1, 6, 8, 7, 4};
		printRepeatedAndMissingElement(arr);

	}
	/**
	 * since elements exist in array from 1 to n with 1 missing and 1 repeated.
	 * 1.find product of n i.e. factorial of n
	 * 2.create a bit mask variable to find out repeated element
	 * 3.find product of element of array
	 * 4.divide element product by repeated element to find unique product
	 * 5.divide step 1 result with step 4 result.
	 * 6. result of 5 is missing element 
	 * 
	 * @param arr
	 */
	static void printRepeatedAndMissingElement(int arr[]) {
		int len = arr.length;
		int mask = 0 ,missing = -1 , repeated =  -1;
		int product = factorial(len);
		int elemProduct = 1;
		for(int i=0;i<len;i++) {
			elemProduct = elemProduct * arr[i];
			int y = 1 << arr[i];
			int res = mask & y;
			if(res > 0 ) {
				repeated = arr[i];
			}
			mask = mask | y;
		}
		elemProduct = elemProduct / repeated;
		missing = product / elemProduct;
		System.out.println(repeated+" "+missing);
	}
	static int factorial(int n){
		if(n==0 || n==1)
			return 1;
		else 
			return n * factorial(n-1);
	}
	
}
