package problems.recursion;

public class PowerOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int res = power(5,3);
     System.out.println(res);
	}
	
	public static int power(int x , int y) {
		if(y==1)
			return x;
		return x * power(x,y-1); 
	}

}
