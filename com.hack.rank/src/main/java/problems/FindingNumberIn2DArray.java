package problems;
/**
 * 
 * 7 - Finding Number in 2D Array
 * Given a 2D array which is ROW-SORTED and COL-SORTED. 
 * Write efficient code to find a given key and print the position i and j 
 * space separated. If it is not found, print -1.

1 2 3 4
6 8 9 10  
7 11 12 13

Search 9 => 1 2
Search 100 => -1

 * @author Admin
 *
 */
public class FindingNumberIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{6,7,8,10},{7,9,12,13}};
		findNumberInSortedGrid(arr,9);
	}
	/**
	 * approach is to start from top right -
	 * 1.if element is greater increment row by 1.
	 * 2.if element is lesser decrement col by 1 in same row.
	 * 3.if equal print i , j and quit.
	 * 4.repeat unless element is found.
	 * @param arr
	 * @param key
	 */
	static void findNumberInSortedGrid(int arr[][], int key) {
		 // Print i j if key is found
		   // -1 otherwise
		   // Give a newLine after printing the answer
		   int rows = arr.length;
		   int cols = arr[0].length;
		   int i=0,j=cols-1;
		   int count = 0, found=0;
		   while(i<=rows-1 && j>=0) {
			   if(arr[i][j]==key) {
				   System.out.println(i+" "+j);
				   found = 1;
				   break;
			   }
			   else if(key>arr[i][j]){
				   i++;
			   }
			   else if(key<arr[i][j]){
				   j--;
			   }
		   }
		   if(found==0) {
			   System.out.println(-1);
		   }
		   
	}

}
