package javaoops;

class User2{
	String username;
	String password;
//	Default constructor
	User2(){
		System.out.println("Default constructor invoked!!!");
	}
//	Parameterized constructor
	User2(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	void getUserInfo(){
		System.out.println(this.username + " " + this.password);
	}
}
public class Sample3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User2 obj = new User2();
		User2 objUser1 = new User2("Alex","123456");
		User2 objUser2 = new User2("Bob","123456");
		objUser1.getUserInfo();
		objUser2.getUserInfo();
	}
}
