package problems;

public class PowerOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(7));
		System.out.println(isPowerOfFour(8));
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(32));
		System.out.println(isPowerOfFour(64));
	}
	
	static boolean isPowerOfFour(int n) 
	{ 
		//check if it is power of 2
	  	boolean result =  (n & (n-1))==0;
	  	int count = 0;
	  	int x = 0;
	  	//power of 4 is always power of 2
	  	if(result) {
	    	while(n>=1) {
	    		x=n%2;
	    		n=n/2;
	    		count++;
	    	}
	    	//if bit is 1 and its at position even , it is power of 4
	    	if(x==1 && ((count-1)%2==0)) {
    			return true;
    		}
	    }
	  	return false;

	}

}
