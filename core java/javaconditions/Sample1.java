package javaconditions;

import java.util.Scanner;

public class Sample1 {

	static void validateAge(int age) {
		if(age >= 18) {
			System.out.println("Eligible to vote !!!");
		}else {
			System.out.println("Not Eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		validateAge(age);
	}

}
