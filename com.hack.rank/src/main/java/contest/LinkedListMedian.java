package contest;

import java.util.Scanner;

public class LinkedListMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nums = scanner.nextLine();
		String data[] = nums.split(" ");
		int len = data.length;
		if(len%2==0){
				double d1 = Double.valueOf(data[(len/2)]);
				double d2 = Double.valueOf(data[(len/2)-1]);
				double d3 = (d1+d2)/2;
				System.out.printf("Value: %.2f", d3);
		} else {
			double d = Double.valueOf(data[(len/2)]);
			System.out.printf("Value: %.2f", d);
		}
		
	}

}
