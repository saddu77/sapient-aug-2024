
class Demo1{
	public String status = "pending";	
	void getStatus(){
		System.out.println("Status is :" + status);
	}	
}

public class Sample2 extends Demo1{

	void updateStatus(){
		status = "completed";
		System.out.println("Status is been updated...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj = new Sample2();
		obj.getStatus();
		obj.updateStatus();
		obj.getStatus();
	}

}
