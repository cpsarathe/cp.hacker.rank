package hack.rank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/pangrams
 * Roy wanted to increase his typing speed for programming contests.
 *  So, his friend advised him to type the sentence 
 *  "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. 
 * (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 * 
 * Approach -
 * 
 * Use Map to Store Aplhabets - O(n)
 * Convert Input String to Upper Case - O(n)
 * Loop through Input String and Check if it exists in map , if exists replace counter of map with 1 - O(n)
 * Loop through map values and sum up all values , if sum is 26 it means its Pangram - O(n)
 * @author CP
 *
 */
public class Pangram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String baseString = scanner.nextLine();
		baseString= baseString.toUpperCase();
		char ch[] = baseString.toCharArray();
		char alphabets[] = {'A','B','C','D','E','F','G','H','I','J',
					'K','L','M','N','O','P','Q','R','S','T',
					'U','V','W','X','Y','Z'
					};
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c: alphabets) {
			map.put(c, 0);
		}
		for(char c: ch) {
			Integer x = map.get(c);
			if(x==null) continue;
			map.put(c,1);
		}
		int x = 0;
		for(Map.Entry<Character,Integer> maap : map.entrySet()) {
			x = x + maap.getValue();
		}
		if(x==26){
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
		scanner.close();
	}

}
