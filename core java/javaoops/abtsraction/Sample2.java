package javaoops.abtsraction;

interface I1{
	void display();
	void getDetails();
}
public class Sample2 implements I1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display()...");
	}
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("getDetails()...");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Sample2 obj = new Sample2();
		obj.getDetails();
		obj.display();
	}
}
