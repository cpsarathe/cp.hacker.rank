package problems;

/**
 * Given a sorted array that has been Rotated.Original Arr: [1, 2, 3, 4, 5, 6], 
 * Rotation at index 3 givesRotated Arr: [4, 5, 6, 1, 2, 3].Write function that 
 * returns the index at which array has been rotated. If it is not rotated at all, 
 * answer index is 0.

  Return how many elements have been moved back as a result of ROTATION!
 * @author Admin
 *
 */
public class RotatedIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 10, 11, 12, 7, 8};
		rotatedIndex(arr);

	}
	
	/**
	 * check if last element is lesser than first
	 * if yes , rotate array right and place last element at first , incremenet rotation counter to 1
	 * check second last and so on unless last is greater than first
	 * 
	 * @param arr
	 * @return
	 */
	static int rotatedIndex(int arr[]) {
		int j = arr.length-1;
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[j]<arr[i]) {
				index++;
				int temp = arr[j];
				for(int k=arr.length-1;k>0;k--){
					arr[k] = arr[k-1];
				}
				arr[0] = temp;
			} else {
				break;
			}
		}
		return index;
	}
}
