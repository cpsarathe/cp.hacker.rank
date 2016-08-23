package problems;

import java.util.HashMap;
import java.util.Map;

public class Akela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,1,3,4,4,3};
		int[] y = {9,7,9,8,8,6,6,5,5};
		System.out.println(findAkelaMap(x));
		System.out.println(findAkelaXoR(y));
	}
	/**
	 * worst complexity to create a map O(n)
	 * worst complexity to find single value in a map O(n)
	 * 
	 * overall complexity 2n
	 * @param arr
	 * @return
	 */
	static int findAkelaMap(int arr[]) {
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	  	for(int i=0;i<arr.length;i++) {
	    	Integer count = map.get(arr[i]);
	      	if(count==null)
	          	map.put(arr[i],1);
	      	else 
	            map.put(arr[i],count+1);
	    }
	  
	  	for(Map.Entry<Integer,Integer> m : map.entrySet()) {
	    	Integer count = m.getValue();
	      	if(count==1) {
	        	return m.getKey();
	        }
	    }
	  	return -1;
	}

	/**
	 * another approach is to find using XoR
	 * complexity is O(n)
	 * @param arr
	 * @return
	 */
	static int findAkelaXoR(int arr[]) {
	   int x = arr[0];
	   for(int i=1;i<arr.length;i++) {
 		   System.out.println("x xor xarr[i]:"+ x + " " + arr[i]);
		   x = x ^ arr[i]; 
	 	   System.out.println("x:"+ x);

	   }
	   return x;
	}
}
