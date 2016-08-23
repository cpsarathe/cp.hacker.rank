package problems;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,10,20,30,40};
		int low = 0;
		int high = arr.length;
		int key = arr[high-1];
		System.out.println(binarySearch(arr,key)); 
	}
	static int findingIdx(int arr[]) {
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) continue;
			if(arr[i]==i){
				index = i;
				break;
			}
		}
		return index;
  }
  static int binarySearch(int arr[],int key) {
      int low = 0;
	  int high = arr.length-1;
	  int index = 0;
	  while (low <= high) {
          int mid = (low + high) / 2;
          int midVal = arr[mid];
          if (midVal < key)
              low = mid + 1;
          else if (midVal > key)
              high = mid - 1;
          else {
        	  if(arr[index]==index){
        		  return index; 
        	  }
          }
          index++;
      }
	  return -1;
  }

}
