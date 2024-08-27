package javaoops.encapsulation;

import java.util.Scanner;
class Authenticate{
	void validateUser(String uname,String pwd) {
		User obj = new User();
		obj.setUsername(uname);
		obj.setPassword(pwd);
		boolean res = obj.isUserExist();
		if(res) {
			System.out.println("User Exist");
		}else {
			System.out.println("User does not exist..");
		}
	}
}

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Authenticate auth_user = new Authenticate();
		System.out.println("Enter Username:");
		String uname = sc.next();
		System.out.println("ENter Password:");
		String pwd = sc.next();
		auth_user.validateUser(uname, pwd);
	}

}
