package hack.rank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/beautiful-binary-string
 * 
 * Approach - 
 * 
 * check if index 0 has 0 , index 1 has 1 and index 2 has 0 consecutively
 * if yes, increase step count by 1 and loop count by 3
 * if no , increase loop count by 1
 * @author Admin
 *
 */
public class BeautifulBinaryString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		scanner.nextLine();
		String binary = scanner.nextLine();
		char ch[] = binary.toCharArray();
		int step = 0;
		for(int i=0;i<length;){
			if((i+3)<=length && ch[i]=='0' && ch[i+1]=='1' && ch[i+2]=='0'){
				i+=3;
				step++;
			} else {
				i++;
			}
		}
		System.out.println(step);
		scanner.close();
	}

}
