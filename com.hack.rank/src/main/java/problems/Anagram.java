package problems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areAnagrams("SILENT", "LISTEN"));
		System.out.println(areAnagrams("GOD", "dog"));
		System.out.println(areAnagrams("PINK", "park"));

	}
	//complexity would be o(nlogn) to sort and o(n) to compare
	//total it would be o(n2)
	static boolean areAnagrams(String first, String second) {
	    char[] firstCh = first.toUpperCase().toCharArray();
	    firstCh = sortArray(firstCh);
	    char[] secondCh = second.toUpperCase().toCharArray();
	    secondCh = sortArray(secondCh);
	    for(int i=0,j=0;i<first.length();i++,j++){
		    	if(firstCh[i]!=secondCh[j]){
		    		return false;
		    	} 
	    }
	    return true;
	}

	static char[] sortArray(char[] arr) {
		Arrays.sort(arr);
		return arr;
	}

}
