package problems;

import java.util.Scanner;

/**
 * 
 * 
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 * 
 * In mathematics, the greatest common divisor (gcd) of two or more integers, when at least one of 
 * them is not zero, is the largest positive integer that divides the numbers without a 
 * remainder. For example, the GCD of 8 and 12 is 4 The number 54 can be expressed as a 
 * product of two integers in several different ways:

{ 54X1=27X2=18X3=9X6.} 54X1=27X2=18X3=9X6.
Thus the divisors of 54 are:

{ 1,2,3,6,9,18,27,54.} 1,2,3,6,9,18,27,54.
Similarly, the divisors of 24 are:

{ 1,2,3,4,6,8,12,24.} 1,2,3,4,6,8,12,24.
The numbers that these two lists share in common are the common divisors of 54 and 24:

{ 1,2,3,6.} 1,2,3,6.
The greatest of these is 6. That is, the greatest common divisor of 54 and 24. One writes:

{ \gcd(54,24)=6.} \gcd(54,24)=6.
 * @author CP
 *
 */
public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		int gcd = 0;
		if(a==0 || b==0) {
			gcd = 0;
		} else {
			if(a==b) {
				gcd = a;
			}
			int j = 0;
			if(a>b) {
				j = b;
			}
			else if(b>a){
				j = a;
			}
			for(int i=j;i>0;i--){
				if(a%i==0 && b%i==0){
					gcd = i;
					break;
				}
			}
		}
			
		
		
		System.out.println(gcd);
		scanner.close();
	}

}
