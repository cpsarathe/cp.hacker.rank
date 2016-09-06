package problems.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = getFibonacci(5);
		System.out.println(n);
	}
	
//  Nth Fibonacci Number
//	Given a positive integer N, 
//	return Nth Fibonacci number. 0th Fib Number is - 01st Fib Number is - 12nd, 3rd, 4th.... 
//	Fib Numbers is sum of previous two
	public static int getFibonacci(int N)
	{
	     if(N==0 || N==1) return N;
	     return getFibonacci(N-1) + getFibonacci(N-2);
	}

}
