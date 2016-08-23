package contest;

import java.util.Scanner;

public class IMPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i=0;i<testCases;i++) {
			String xyz = scanner.nextLine(); 
			int singInt = scanner.nextInt(); 
			String spaceInteger = scanner.nextLine();
			
			String[] strings = xyz.split(" ");
			int[] arr = new int[strings.length];
			int j = 0;
			for(String str : strings) {
				arr[j++]= Integer.valueOf(str);
			}
			strings = null;
			
			strings = spaceInteger.split(" ");
			int[] nArr = new int[strings.length];
			j = 0;
			for(String str : strings) {
				nArr[j++]= Integer.valueOf(str);
			}
		}
		
	}

}
