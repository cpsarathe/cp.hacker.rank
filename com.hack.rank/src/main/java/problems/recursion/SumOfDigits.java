package problems.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = getSumOfDigits(9);
		System.out.println(sum);
	}
    public static int getSumOfDigits(int n)
    {
        if(n==0) return 0;
    	int rem = n % 10;
        n = n/10;
        return rem + getSumOfDigits(n);
    }
}
