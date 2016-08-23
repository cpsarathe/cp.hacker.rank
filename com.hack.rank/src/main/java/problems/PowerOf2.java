package problems;

import java.util.Scanner;

public class PowerOf2 {

	/**
	 * binary of 16 is 10000 & 15 is 01111
	 * if we perform end it will always be 0
	 * 
	 * binary of 12 is 01100 & 11 is 01011
	 * if we perform end it will not always be 0
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num==0){
			System.out.println("Not Power of 2");
		}
		else if((num & (num-1))==0) {
			System.out.println("Power of 2");
		} else {
			System.out.println("Not Power of 2");
		}
		scanner.close();
	}

}
