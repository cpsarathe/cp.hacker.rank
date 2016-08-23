package problems;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getReverseN(12);

	}

	static int getReverseN(int n) 
	{
	   int count = 0;
	   int temp = n;
	   while(temp>=1) {
	    temp = temp/10;
	    count++;
	   }
	   int sum = 0;
	   for(int i = count,j=0 ; i>0;i--,j++) {
		    	int dec = (int)Math.pow(10,i-1);
		    	int res = n % 10 ;
		    	n = n/10;
		    	sum  = sum + res * dec;
	   	}
	   System.out.println(sum);
	   return sum;
		
	  
	}
}
