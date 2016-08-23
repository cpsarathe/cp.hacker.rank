package problems;

import java.util.Scanner;

public class MergeOverlappingInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCases; i++) {
			scanner.nextLine();
			int intervals = scanner.nextInt();
			scanner.nextLine();
			int arr[][] = new int[intervals][2];
			for (int j = 0; j < intervals; j++) {
				arr[j][0] = scanner.nextInt();
				arr[j][1] = scanner.nextInt();
			}

			for (int j = 0; j < intervals; j++) {
				if ((j + 1) < intervals && arr[j][1] > arr[j + 1][0]) {
					sb.append(arr[j][0]);
					sb.append(" ");
					sb.append(arr[j + 1][1]);
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		scanner.close();

	}

}
