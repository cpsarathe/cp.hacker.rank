package hack.rank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String str[] = line.split(" ");
        int arr[] = new int[str.length];
        int i = 0;
        double pos_count = 0;
        double neg_count = 0;
        double zero_count = 0;
               
        for(String st : str) {
            int x = Integer.valueOf(st);
            if(x==0) zero_count++;
            else if(x<0) neg_count++;
            else if(x>0) pos_count++;
        }
        
        double zero_fraction = zero_count / arr.length;
        BigDecimal bdZero = new BigDecimal(zero_fraction);
        bdZero = bdZero.setScale(6,RoundingMode.HALF_UP);
        
        double pos_fraction = pos_count / arr.length;
        BigDecimal bdPos = new BigDecimal(pos_fraction);
        bdPos = bdPos.setScale(6,RoundingMode.HALF_UP);
        
        double neg_fraction = neg_count / arr.length;
        BigDecimal bdNeg = new BigDecimal(neg_fraction);
        bdNeg = bdNeg.setScale(6,RoundingMode.HALF_UP);
        
        System.out.println(bdPos);
        System.out.println(bdNeg);
        System.out.println(bdZero);
        
    }

}
