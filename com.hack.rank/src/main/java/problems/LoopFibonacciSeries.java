package problems;

public class LoopFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibSeries(8);

	}
	static void printFibSeries(int n) 
	{
		 int a = 0 ;
		 int b = 1;
		 System.out.print(a + " ");
		 for(int i=1;i<n;i++) {
			 int temp = a;
			 a = a + b;
			 b = temp;
			 System.out.print(a + " ");
		 }
				 
	}

}
