package javafunctions;

import java.util.Scanner;

public class Sample3 {
	static void addition(int num1,int num2){		
		int res;		
		res = num1 + num2;
		System.out.println("Sum of two numbers are: " + res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addition(20,20);
//		addition(30,30);
//		addition(40,40);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int number2 = sc.nextInt();
		addition(number1, number2);
	}

}
