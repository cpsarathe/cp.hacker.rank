package contest;

import java.util.Scanner;

public class MusicalChair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int participant = scanner.nextInt();
		String arr[] = new String[participant];
		for(int i=0;i<participant;i++){
			scanner.nextLine();
			String val = scanner.next();
			arr[i] = val;
		}
		scanner.nextLine();
		int round = scanner.nextInt();
		String str = "";
		for(int i=0;i<participant;i++){
			str = str + arr[i] + " "; 
		}
		System.out.println(str);
		String temp1 = "";
		for(int i=0;i<round;i++) {
			temp1 = temp1 + arr[i] + " "; 
		}
		String temp2 = "";
		for(int i=round;i<participant;i++) {
			temp2 = temp2 + arr[i] + " "; 
		}
		temp2 = temp2 + temp1;
		System.out.println(temp2);
		scanner.close();
	}

}
