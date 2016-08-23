package problems;

public class IntegralAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 2, 4, 4};
		System.out.println(largerHalfIntegralAvg(arr));

	}
	
	static int largerHalfIntegralAvg(int arr[]) {
	    // TODO:  Return Index of unique element
	    int mid = arr.length/2;
	  	int sum1 = 0 , avg1 = 0 , i=0  ;
	    for(i=0;i<mid;i++) {
	    	sum1 = sum1 + arr[i];
	    }
	    avg1 = sum1 / i;
	  	int sum2 = 0 , avg2=0 , j=0;
	  	for(j=mid;j<arr.length;j++){
	    	sum2 = sum2 + arr[j];
	    }
	  	avg2 = sum2/(j-mid);
	    if(avg1>avg2){ return avg1 ; }
	    else return avg2;
	}

}
