package javaoops.inheritance;

class A{
	int num1 = 20;
}

class B extends A{
	int num2 = 30;
	int res;
	
	void addition() {
		res = num1 + num2;
		System.out.println("sum of two numbers is: " + res);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.addition();
	}
}
