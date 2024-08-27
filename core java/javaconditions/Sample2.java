package javaconditions;

import java.util.Scanner;

public class Sample2 {
	static void getResults(int p) {
		if(p >= 85 && p <= 100) {
			System.out.println("FCD !!!");
		} else if(p >= 60 && p < 85) {
			System.out.println("First Class");
		} else if(p >= 35 && p < 60) {
			System.out.println("Pass");
		} else if(p >= 0 && p < 35) {
			System.out.println("Fail");
		} else {
			System.out.println("Enter Percentage between 1 and 100");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage:");
		int percentage = sc.nextInt();
		getResults(percentage);
	}

}
