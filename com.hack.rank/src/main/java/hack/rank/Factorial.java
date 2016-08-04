package hack.rank;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Factorial. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Factorial Factorial = new Factorial();
        int fact = Factorial.factorial(num);
        System.out.println(fact);
    }
    
    public int factorial(int n){
    	if(n<2) return 1;
        return n * factorial(n-1);
    }
}