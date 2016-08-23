package hack.rank;

import java.util.Scanner;

/**
 * 
 * https://www.hackerrank.com/challenges/alternating-characters?h_r=next-challenge&h_v=zen
 * 
 * Approach - 
 * check if there are consecutive characters for input testCase.
 * If yes , increase the counter by 1.
 * Repeat unless end of string.
 * There will be n-1 comparison for n records , so 
 * value of counter(n-1) equals to to be deleted.
 * 
 * @author CP
 *
 */
public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		int result[] = new int[noOfTestCases];
		String testCases[] = new String[noOfTestCases];
		for(int i = 0; i<noOfTestCases;i++) {
			scanner.nextLine();
			String testCase = scanner.next();
			testCases[i] = testCase;
		}
		
		for(int i = 0; i<noOfTestCases;i++) {
			String testCase = testCases[i];
			char[] ch = testCase.toCharArray();
			int count = 0;
			for(int j = 0;j<ch.length;){
				if((j+1)<ch.length && ch[j]==ch[j+1]){
					count++;
				}
				j++;
			}
			result[i] = count;
		}
		
		for(int i = 0; i<noOfTestCases;i++) {
			System.out.println(result[i]);
		}

	}

}
