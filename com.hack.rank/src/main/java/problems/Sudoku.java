package problems;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9x9
		int arr[][] = {
				{8,2,5,4,7,1,3,9,6},
				{1,9,4,3,2,6,5,7,8},
				{3,7,6,9,8,5,2,4,1},
				{5,1,9,7,4,3,8,6,2},
				{6,3,2,5,9,8,4,1,7},
				{4,8,7,6,1,2,9,3,5},
				{2,6,3,1,5,9,7,8,4},
				{9,4,8,2,6,7,1,5,3},
				{7,5,1,8,3,4,6,2,9}
				};
		validateSudoku(arr);
	}
	
	static boolean validateSudoku(int arr[][]) {
	    int rows = arr.length;
	    int cols = arr[0].length;
	    int expectedSum = (rows * (rows + 1) ) / 2;
	    int rowSum=0;
	    int colSum=0;
	    for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<cols;j++) {
	    			rowSum = rowSum + arr[i][j];
		    		colSum = colSum + arr[j][i];
	 	      }
	    	  if(expectedSum!=rowSum && rowSum!=colSum) {
		    		System.out.println("INVALID");
		    		return false;
		      }
	    }
	    System.out.println("VALID");
	    return true;
	   
	}

}
