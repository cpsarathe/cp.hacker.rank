package problems;

public class MagicSquare {

	public static void main(String[] args) {
		int arr[][] = {{8,1,6},{3,5,7},{4,9,2}};
		//int arr[][] = {{15,0,0},{0,15,0},{0,0,15}};
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		validateMagicSq(arr);
	}
	/**
	 * sum of rows, sum of cols and sum of diagonal always equal
	 * @param arr
	 */
	static void validateMagicSq(int arr[][]) {
	    int rows = arr.length;
	    int cols = arr[0].length;
	    int rowSum=0;
	    int colSum=0;
	    int diag1Sum=0;
	    int diag2Sum=0;
	    for(int i=0;i<rows;i++) {
	    	for(int j=0;j<cols;j++) {
	    		rowSum = rowSum + arr[i][j];
	    		colSum = colSum + arr[j][i];
	    		if(i==j) {
	    			diag1Sum = diag1Sum + arr[i][j]; 
	    		}
		    }
	    	if(rowSum!=colSum) {
	    		System.out.println("INVALID");
	    		return;
	    	}
	    	diag2Sum = diag2Sum + arr[i][(rows-1)-i]; 
	    }
	    
	    boolean flag = false;
	   
	    if(rowSum==colSum && diag1Sum==diag2Sum){
	    	flag = true;
	    }
	    
	    if(flag) {
	    	System.out.println("VALID");
    	}
    	else{
	    	System.out.println("INVALID");
    	}
	}

}
