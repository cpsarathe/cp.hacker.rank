package hack.rank;

import java.util.LinkedHashMap;
import java.util.Scanner;
/**
 * 
 * Problem Statement - https://www.hackerrank.com/challenges/reduced-string
 * Remove Consecutive Duplicates as much as possible.
 * @author CP
 *
 */

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String baseString = scanner.next();
		char ch[] = baseString.toCharArray();
		SuperReducedString sr = new SuperReducedString();
		sr.removeDuplicates(ch);
		scanner.close();
	}
	
	public void removeDuplicates(char[] ch){
		int len = ch.length;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<len;i++) {
			Integer index = map.get(ch[i]);
			if(index==null) {
				map.put(ch[i],i);
			}
			else if(index!=null) {
				map.remove(ch[i]);
			} 
		}
		if(map.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		StringBuilder sb = new StringBuilder();
		for(char c : map.keySet()) {
			sb.append(c);
		}	
		System.out.println("Empty String");
		
	}

}
