package problems;

import java.util.Scanner;

/**
 * 
 * 
https://en.wikipedia.org/wiki/Least_common_multiple

A multiple of a number is the product of that number and an integer. For example, 10 is a multiple of 5 because 5 × 2 = 10, so 10 is divisible by 5 and 2. Because 10 is the smallest positive integer that is divisible by both 5 and 2, it is the least common multiple of 5 and 2. By the same principle, 10 is the least common multiple of −5 and -2 as well.

Notation[edit]
In this article we will denote the least common multiple of two integers a and b as lcm(a, b).

Some older textbooks use [a, b].[2][3]

The programming language J uses a*.b

Example[edit]
What is the LCM of 4 and 6?

Multiples of 4 are:

4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, ...
and the multiples of 6 are:

6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, ...
Common multiples of 4 and 6 are simply the numbers that are in both lists:

12, 24, 36, 48, 60, 72, ....
So, from this list of the first few common multiples of the numbers 4 and 6, their least common multiple is 12.
 * @author CP
 *
 */
public class LCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		int lcm = 0;
		if(a==0 || b==0)
			lcm = 0;
		else {
			if(a==b) 
				lcm = a;
			else {
				// 24 , 16
				//a= 48 , 72
				//b = 16 , 32 ,48
				if(a>b){
					if(a%b==0){
						lcm = a;
					} else {
						int factor = 2;
						int multiple = 1;
						boolean isLCM = false;
						//keep multiplying smaller number b with factor
						// if result is completely divisible by a , its lcm
						while(isLCM==false) {
							multiple = factor * b;
							if(multiple%a==0) {
								lcm = multiple;
								isLCM = true;
							}
							factor++;
						}
						
					}
				} else { //b>a
					// 16 , 24
					//b = 48 , 72
					//a = 16 , 32 ,48
					if(b%a==0){
						lcm = b;
					} else {
						int factor = 2;
						int multiple = 1;
						boolean isLCM = false;
						//keep multiplying smaller number a with factor
						// if result is completely divisible by b , its lcm
						while(isLCM==false) {
							multiple = factor * a;
							if(multiple%b==0) {
								lcm = multiple;
								isLCM = true;
							}
							factor++;
						}
					}	
				}
			}
		}
		System.out.println(lcm);
		scanner.close();
	}

}
