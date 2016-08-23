package spoj;

import java.util.BitSet;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * 
 * http://www.spoj.com/problems/PRIME1/
 * 
 * Peter wants to generate some prime numbers for his cryptosystem. Help him!
 * Your task is to generate all prime numbers between two given numbers!
 * 
 * Input
 * 
 * The input begins with the number t of test cases in a single line (t<=10). In
 * each of the next t lines there are two numbers m and n (1 <= m <= n <=
 * 1000000000, n-m<=100000) separated by a space.
 * 
 * Output
 * 
 * For every test case print all prime numbers p such that m <= p <= n, one
 * number per line, test cases separated by an empty line.
 * 
 * Example
 * 
 * Input: 2 1 10 3 5
 * 
 * Output: 2 3 5 7
 * 
 * 3 5 Warning: large Input/Output data, be careful with certain languages
 * (though most should be OK if the algorithm is well designed)
 * 
 * @author CP
 *
 */
public class PrimeGenerator {

	public static void main(String[] args) throws ExecutionException,
			InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		PrimeGenerator pg = new PrimeGenerator();
		int[][] testCase = new int[noOfTestCases][2];
		for (int i = 0; i < noOfTestCases; i++) {
			scanner.nextLine();
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			testCase[i][0] = m;
			testCase[i][1] = n;
		}
		for (int i = 0; i < noOfTestCases; i++) {
			int m = testCase[i][0];
			int n = testCase[i][1];
			System.out.println();
			showPrimes(m, n);
		}

		scanner.close();
	}

	public static void showPrimes(int m, int n) {

		BitSet bit = new BitSet(n); 
		bit.set(0, n);

		final int maxRoot = (int) Math.sqrt(n);
		System.out.println("maxRoot"+maxRoot);
		for (int candidate = 2; candidate <= maxRoot; candidate++) {
			if (bit.get(candidate)) {
				for (int j = 2 * candidate; j < n; j += candidate) {
					bit.set(j,false);
				}
			}
		}
		int j = 0;
		for (int i = m; i < n; i++) {
			if (bit.get(i)) {
				j++;
				System.out.println(i);
			}
		}
		System.out.println("j"+j);
	}

	/**
	 * a number is said to be prime if its not divisible by every number from 2
	 * to sqrt(n)
	 * 
	 * If a number n is not a prime, it can be factored into two factors a and
	 * b:
	 *
	 * n = a*b If both a and b were greater than the square root of n, a*b would
	 * be greater than n. So at least one of those factors must be less or equal
	 * to the square root of n, and to check if n is prime, we only need to test
	 * for factors less than or equal to the square root.
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrime(long num) {
		long x = (long) Math.sqrt(num);
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
