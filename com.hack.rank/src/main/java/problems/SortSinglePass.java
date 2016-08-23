package problems;

public class SortSinglePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 2, 1, 2, 0};
		sort012(arr);
	}
	static void sort012(int arr[]) {
	    int i = 0, j= 0, k = arr.length-1;
	    while(j<=k) {
	    	if(arr[j]==0){
	    		int temp = arr[i];
	    		arr[i] = arr[j];
	    		arr[j] = temp;
	    		i++;
	    		j++;
	    	}
	    	else if(arr[j]==1){
	    		j++;
	    	} 
	    	else if(arr[j]==2){
	    		int temp = arr[j];
	    		arr[j] = arr[k];
	    		arr[k] = temp;
	    		k--;
	    		
	    	}
	    }
	    for(i =0 ;i<arr.length;i++){
	    	System.out.println(arr[i]);
	    }
	}

}
