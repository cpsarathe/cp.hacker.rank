package problems;
/**
 * Given a R x R matrix, Perform in-place rotation of matrix, Clockwise.  Look at the example of rotation.

Note:  Do it in-place in O(R^2).

rotateClockWise(
[ 1, 2, 3 ]			[ 7, 4, 1 ]
[ 4, 5, 6 ]    => 	[ 8, 5, 2 ]
[ 7, 8, 9 ])		[ 9, 6, 3 ])
 * @author Admin
 *
 */
public class RotateSquareMatrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
		rotateClockWise(arr);
	}
	
	static void rotateClockWise(int matrix[][]) {
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		int n = rows;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				//move bottom left to top left
				matrix[i][j] = matrix[n-1-j][i];
				//move bottom right to bottom left
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				//move top right to bottom right
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				//move top left to top right
				matrix[j][n-1-i] = temp;
			}
		}
		    
//	   for(int i=0;i<rows;i++) {
//		   for(int j=0;j<cols;j++) {
//			    System.out.print(matrix[i][j] +" ");
//		   }
//		   System.out.println();
//	   }
	}

}
