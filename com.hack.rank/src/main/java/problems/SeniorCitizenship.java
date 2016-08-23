package problems;

import java.util.Scanner;

public class SeniorCitizenship {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String sex = sc.next();
		int age = sc.nextInt();
		String text = getSeniorCitizenship(sex, age);
		System.out.println(text);
		sc.close();
	}
	public static String getSeniorCitizenship(String sex , int age) {
      if(sex.equalsIgnoreCase("f") && age >=58) {
      	return "Senior Citizen";
      } else if(sex.equalsIgnoreCase("m") && age >=60) {
      	return "Senior Citizen";
      } else {
      	return "Not A Senior Citizen";
      }
	}
}
