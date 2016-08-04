package hack.rank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		String binary = getBinaryNumbers(n);
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int maxOccurence = 0;
		for(char ch : binary.toCharArray()) {
			if(ch=='1') {
				Integer count = map.get(ch);
				if(count==null) {
					count = 1;
					map.put('1',count);
				} else {
					map.put('1',++count);
				}
				if(count > maxOccurence ) {
					maxOccurence = count;
				}
			} else {
				map.clear();
			}
		}
		System.out.println(maxOccurence);
		scanner.close();
	}
	
	public static String getBinaryNumbers(long n) {
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			long x = n%2;
			n = n/2;
			sb.append(x);
		}
		char c[] = sb.toString().toCharArray();
		char[] ch = new char[c.length];
		
		for(int i = c.length-1,j=0; i>=0 && j<c.length;i--,j++){
			ch[j] = c[i];
		}
		return new String(ch);
	}

}
