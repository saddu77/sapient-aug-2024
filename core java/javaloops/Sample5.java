package javaloops;


public class Sample5{

	protected String status = "scheduled";
	
	void getStatus(){
		System.out.println("Status is: " + status);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample5 obj = new Sample5();
		System.out.println(obj.status);
	}

}
