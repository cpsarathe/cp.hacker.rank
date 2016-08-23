package problems;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printStarTriangle(4);
	}
	static void printStarTriangle(int rows) 
	{
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(j<=i){
					System.out.print("*");	
				}
				System.out.print(" ");	
			}
			System.out.println();
		}
	}
}
