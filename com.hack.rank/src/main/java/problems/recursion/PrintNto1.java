package problems.recursion;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNTo1(0);
		print1ToN(0);
	}
	
	public static void printNTo1(int n){
		if(n<=0) return;
		System.out.println(n);
		if(n==1) return;
		printNTo1(n-1);
	}
	public static void print1ToN(int n){
		if(n<=0) return;
		print1ToN(n-1);
		System.out.println(n);
	}

}
