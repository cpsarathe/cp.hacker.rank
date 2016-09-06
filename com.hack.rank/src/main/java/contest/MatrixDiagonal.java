package contest;

import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int arr[][] = new int[m][m];
		for(int i=0;i<m;i++) {
			scanner.nextLine(); 
			for(int j=0;j<m;j++) {
				int val = scanner.nextInt();
				arr[i][j] = val;
			}
		}
		int d1 = 0, d2 =0;
		for(int i = 0; i< arr.length;i++){
			d1 = d1 + arr[i][i];
		}
		for(int i = arr.length-1,j=0;i>=0 && j<arr.length;i--,j++){
			d2 = d2 + arr[i][j];
		}
		System.out.println(Math.abs(d1 - d2));
	}

}
