package problems;

public class TwoNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,7,9,2,4};
		printTwoNRIntegers(arr);
	}

	static void printTwoNRIntegers(int arr[]) {
        // TODO:  Return Index of unique element
        int mask = 0 , j = 0;
        int num[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
			int y = 1 << arr[i];
			int res = mask & y;
			if(res > 0 ) {
				
			} else {
				mask = mask | y;
				num[j] = arr[i];
                j++;	
			}
			
		}
        if( num[1] > num[0] ) {
         		System.out.println(num[0]+" "+num[1]);
        } else {
    			System.out.println(num[0]+" "+num[1]);
        }
   }
}
