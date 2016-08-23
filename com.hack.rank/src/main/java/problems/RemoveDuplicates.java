package problems;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDupChars("apple".toCharArray());
		//System.out.println(hasUniqueChars("india".toCharArray()));

	}
	/**
	 * create a temp boolean array of size 255 ,values are initially set to false
	 * loop through character array
	 * check if each character exist in boolean array
	 * if not visited 
	 *     add it in boolean array as visited
	 * if visited 
	 *     rotate all elements of array to left
	 * @param arr
	 */
	static void removeDupChars(char arr[]) {
		//supports all characters alphabets,digits,special char
		boolean visited[] = new boolean[256];
		int count = 0;
		for(int i=0;i<arr.length-count-1;) {
			if(!visited[arr[i]]) {
				visited[arr[i]] = true;i++;
			} else {
				for(int j=i;j<arr.length;j++) {
					if( j+1 >= (arr.length) ) break;
					arr[j] = arr[j+1];
				}
				count++;
				arr[arr.length-1] = '\0';
			}
		}
		System.out.println(new String(arr));
	}
	
	static boolean hasUniqueChars(char[] str){
		if(str.length>26) return false;
		// mask is used as a bitmap to indicate which characters
	    // have been seen already
		int mask= 0;
		for(int i=0;i<str.length;i++){
			// set val to be the difference between the char at i and 'a'
	        // unicode 'a' is 97
	        // if you have an upper-case letter e.g. 'A' you will get a
	        // negative 'val' which is illegal
			int x = str[i]-'a';
			int y = 1 << x;
			int res = mask & y;
			 // if this lowercase letter has been seen before, then
	        // the corresponding bit in checker will have been set and
	        // we can exit immediately.
			if(res>0) return false;
			// set the bit to indicate we have now seen the letter.
			mask = mask | y;
		}
		return true;
	}

}
