package problems;

import java.util.Random;

public class Shuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int arr[] = {1,2,3,4,5};
	 Random random = new Random();
	 for(int i=arr.length;i>0;i--) {
		 int num = random.nextInt(i);
		 int temp = arr[i-1];
		 arr[i-1] = arr[num];
		 arr[num] = temp;
		 System.out.print(arr[i-1]+" ");
	 }
	 
	}
	

}
