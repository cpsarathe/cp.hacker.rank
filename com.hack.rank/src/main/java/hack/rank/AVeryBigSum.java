package hack.rank;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String strArr[] = line.split(" ");
        long sum = 0;
        for(String str : strArr){
            long val = Long.valueOf(str);
            sum = sum + val;
        }
        System.out.println(sum);
    }
}
