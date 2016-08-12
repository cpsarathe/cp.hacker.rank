package hack.rank;

import java.util.Scanner;

public class CamelCaseCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[] = s.toCharArray();
        int count = 0;
        for(char c :ch){
        	if(c>=65 && c<=90){
        		count++;
        	}
        }
        System.out.println(count+1);
        in.close();

	}

}
