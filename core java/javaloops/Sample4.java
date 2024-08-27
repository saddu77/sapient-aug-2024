package javaloops;

class Demo2{
	String status = "In-Progress";
	void getStatus(){
	System.out.println("Status is: " + status);	
	}
}

public class Sample4 extends Demo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 obj = new Sample4();
		System.out.println("Status is: " + obj.status);
	}

}
