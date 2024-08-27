package javaoops;

class User1{
//	default constructor
	User1(){
		System.out.println("Constructor is invoked");
	}
	
	void getInfo(){
		System.out.println("getInfo()....");
	}
	
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 obj = new User1();
		obj.getInfo();
	}

}
