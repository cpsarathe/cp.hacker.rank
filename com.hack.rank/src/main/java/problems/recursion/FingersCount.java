package problems.recursion;

public class FingersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getTotalFingersCount(3));
	}
	public static int getTotalFingersCount(int n) {
		if(n==0)
			return n;
		int sum = 0;
		if(n%2==0) {
			sum = sum + 11;
		} else {
			sum = sum + 10;
		}
		return sum + getTotalFingersCount(n-1);
	}

}
