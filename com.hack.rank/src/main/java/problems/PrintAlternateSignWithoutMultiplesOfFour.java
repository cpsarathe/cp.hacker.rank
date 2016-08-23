package problems;

public class PrintAlternateSignWithoutMultiplesOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAlternateSignWithoutMultiplesOfFour(9);

	}
	
	static void printAlternateSignWithoutMultiplesOfFour(int n){
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(i%4==0) {
				count++;
			}
		}
		int j = 1;
		for(int i=1;i<=n+count;i++) {
			if(i%4==0) continue;
			if(j==1){
				System.out.print(i+" ");	
				j=0;
			} else {
				int x = i;
				x = -x;
				j = 1;
				System.out.print(x+" ");
			}
			
		}
		
	}

}
