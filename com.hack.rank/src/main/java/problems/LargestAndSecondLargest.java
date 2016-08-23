package problems;

public class LargestAndSecondLargest {

	public static void main(String[] args) {
		LargestAndSecondLargest test = new LargestAndSecondLargest();
		test.printLargestAndSecondLargest(10, 3, 60);
		System.out.println("-------------");
		test.printLargestAndSecondLargest(60, 10, 3);
		System.out.println("-------------");
		test.printLargestAndSecondLargest(3, 60, 10);
		System.out.println("-------------");
		test.printLargestAndSecondLargest(3, 10, 60);
		System.out.println("-------------");
		test.printLargestAndSecondLargest(60,60, 60);
	}
	void printLargestAndSecondLargest(int a, int b, int c) 
	{
	    int arr[] = new int[]{a,b,c};
	    int temp = 0;
	    for(int i=0;i<arr.length;i++){
	    	for(int j=0;j<arr.length;j++){
	    		if(arr[i]>arr[j]){
	    			temp = arr[j];
	    			arr[j] = arr[i];
	    			arr[i] = temp; 
	    		}
	    	}
	    }
	    System.out.print(arr[0] + " " + arr[1]);
	    System.out.println();
	}
	

}
