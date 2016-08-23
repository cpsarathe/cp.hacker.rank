package hack.rank;

import java.math.BigInteger;
import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        scanner.nextLine();
//        String line = scanner.nextLine();
//        String strArr[] = line.split(" ");
//        long sum = 0;
//        for(String str : strArr){
//            long val = Long.valueOf(str);
//            sum = sum + val;
//        }
//        System.out.println(sum);
		
		  Scanner scanner = new Scanner(System.in);
	      String x = scanner.next();
	      String y = scanner.next();
	      BigInteger x1 = new BigInteger(x);
	      BigInteger y1 = new BigInteger(y);
	      System.out.println(x1.add(y1));
	      scanner.close();
    }
}
