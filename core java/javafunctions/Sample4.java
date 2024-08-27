package javafunctions;

public class Sample4 {

	static int addition(int num1,int num2){		
		int res;		
		res = num1 + num2;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = addition(30, 40);
		System.out.println("Sum of two numbers is: " +  sum);
	}

}
