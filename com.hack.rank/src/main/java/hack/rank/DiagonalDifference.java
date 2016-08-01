package hack.rank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      	Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		scanner.nextLine(); 
	    
		long matrix[][] = new long[rows][rows];
		for(int x = 0 ;x < rows ; x++){
			String line = scanner.nextLine(); 
			matrix[x] = new long[rows];
			int j = 0;
			for(String str : line.split(" ")) {
				int val = Integer.valueOf(str);
				matrix[x][j] = val;
				j++;
			}
		}
       long diag1= 0;
		for(int i = 0; i< matrix.length;i++){
			diag1 = diag1 + matrix[i][i];
		}
		long diag2=0;
		for(int i = matrix.length-1,j=0;i>=0 && j<matrix.length;i--,j++){
			diag2 = diag2 + matrix[i][j];
		}
  		System.out.println(Math.abs(diag1 - diag2));

   }

}
