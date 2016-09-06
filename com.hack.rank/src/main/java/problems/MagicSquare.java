package problems;

public class MagicSquare {

	public static void main(String[] args) {
		//int arr[][] = {{8,1,6},{3,5,7},{4,9,2}};
		//int arr[][] = {{15,0,0},{0,15,0},{0,0,15}};
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//validateMagicSq(arr);
		int arr[][] = generateMagicSquare(5,5);
		System.out.println(validateMagicSq(arr));
	}
	/**
	 * sum of rows, sum of cols and sum of diagonal always equal
	 * @param arr
	 */
	static boolean validateMagicSq(int arr[][]) {
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
	    		return false;
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
	    return flag;
	}
	/**
	 * start from bottom middle , place 1 there
	 * loop through 2 to n x n
	 * move right and down , put value.
	 * 		if down doesn't exist , go to top most.
	 *      if right doesn't exist , go to left most.
	 * if element already exist move above put value
	 * @param arr
	 */
	static int[][] generateMagicSquare(int row , int col) {
		int arr[][] = new int[row][col];
		int n = row ;
		col = n/2;
		row = n - 1;
		arr[row][col] = 1;
		for (int i = 2; i <= n*n; i++) {
            if (arr[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
                // don't change col
            }
            arr[row][col] = i;
        }
		System.out.println("");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		return arr;
	}

}
