package problems;

/**
(Left->Right, Top->Down, Right->Left, Down->Up)

Example Matrix of size 3x3:
[ 1, 2, 3 ]
[ 4, 5, 6 ]
[ 7, 8, 9 ]

Expected Output (Notice comma separation)
1, 2, 3, 6, 9, 8, 7, 4, 5

Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


++++++++++++++++++++++++++++++++++
Fill matrix spirally

Given a R x C matrix;    Fill matrix with values from 1 to R*C spirally.
We've to repeatedly print elements using these orders (Left->Right, Top->Down, Right->Left, Down->Up)

Example Input Matrix of size 3x3:
[ 0, 0, 0 ]
[ 0, 0, 0 ]
[ 0, 0, 0 ]

Expected Output (Notice comma separation)
[ 1, 2, 3 ]
[ 8, 9, 4 ]
[ 7, 6, 5 ]

Also print newline after all the elements have been printed.
 * @author Admin
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		//int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//int arr[][] = {{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
		//printSpirally(arr);
		int arr[][] ={{0,0,0},{0,0,0},{0,0,0}};
		generateSpiral(arr);
	}
	
	/**
	 * define top (0,0) , bottom(0,n) , right(m,n) , left(0,0)
	 * 
	 * @param arr
	 */
	static void printSpirally(int arr[][]) {
	    // there must be comma between two elements.
	    // after printing all elements, print a newline char as well.
		int rows = arr.length;
		int cols= arr[0].length;
		int n = rows * cols;
		int left=0,right=cols-1,top=0,bottom=rows-1,dir=0;
		StringBuilder sb = new StringBuilder();
		while(top<=bottom && left<=right){
			if(dir==0) {
				//left to right
				for(int i=left;i<=right;i++) {
					sb.append(arr[top][i]);
					sb.append(", ");
				}
				top++;
			}
			else if(dir==1) {
				//top to down
				for(int i=top;i<=bottom;i++) {
					sb.append(arr[i][right]);
					sb.append(", ");
				}
				right--;
			}
			else if(dir==2) {
				//right to left
				for(int i=right;i>=left;i--) {
					sb.append(arr[bottom][i]);
					sb.append(", ");
				}
				bottom--;
			}
			else if(dir==3) {
				//bottom to up
				for(int i=bottom;i>=top;i--) {
					sb.append(arr[i][left]);
					sb.append(", ");
				}
				left++;
			}
			dir = (dir+1) % 4;
		}
		
		sb.delete(sb.length()-2, sb.length());
		System.out.println(sb);
		
	}
	
	static void generateSpiral(int arr[][]) {
	    // fill matrix spirally from 1 to R*C
	    // matrix has sufficient space, just fill it properly
		int rows = arr.length;
		int cols= arr[0].length;
		int left=0,right=cols-1,top=0,bottom=rows-1,dir=0;
		StringBuilder sb = new StringBuilder();
		int elem = 1;
		while(top<=bottom && left<=right){
			if(dir==0) {
				//left to right
				for(int i=left;i<=right;i++) {
					arr[top][i] = elem;
					sb.append(elem);
					sb.append(", ");
					elem++;
				}
				top++;
			}
			else if(dir==1) {
				//top to down
				for(int i=top;i<=bottom;i++) {
					arr[i][right] = elem;
					sb.append(elem);
					sb.append(", ");
					elem++;
				}
				right--;
			}
			else if(dir==2) {
				//right to left
				for(int i=right;i>=left;i--) {
					arr[bottom][i] = elem;
					sb.append(elem);
					sb.append(", ");
					elem++;
				}
				bottom--;
			}
			else if(dir==3) {
				//bottom to up
				for(int i=bottom;i>=top;i--) {
					arr[i][left] = elem;
					sb.append(elem);
					sb.append(", ");
					elem++;
				}
				left++;
			}
			dir = (dir+1) % 4;
		}
		
		sb.delete(sb.length()-2, sb.length());
		//System.out.println(sb);
		
	}


}
