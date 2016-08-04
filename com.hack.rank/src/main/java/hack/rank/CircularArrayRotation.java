package hack.rank;


import java.util.Scanner;

public class CircularArrayRotation {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        String inputs[] = input.split(" ");
	        int size = Integer.valueOf(inputs[0]);
	        int rotation = Integer.valueOf(inputs[1]);
	        int query = Integer.valueOf(inputs[2]);
	        
	        String array[] = scanner.nextLine().split(" ");
	        int temp = 0;
	        for(int i=0;i<rotation;i++) {
	            System.out.println("--------");
	            array[0] = array[array.length-1];
	            for(int j=array.length-1;j>0;j--){
	                array[j] = array[j-1];    
	            }
	             System.out.println(array[i]);
	            
	        }
	        for(int j =0;j<array.length;j++) {
	            System.out.println(array[j]);
	        }
	        
	        for(int j =0;j<query;j++) {
	            int q = scanner.nextInt();
	            System.out.println("q::"+q);
	            System.out.println(array[q]);
	        }
	        
	    }
	}

