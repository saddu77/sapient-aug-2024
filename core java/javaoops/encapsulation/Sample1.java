package javaoops.encapsulation;

public class Sample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setUsername("alex");
		user1.setPassword("123456");
		System.out.println(user1.getUsername() + " " +
						   user1.getPassword());
		
		User user2 = new User();
		user2.setUsername("Bob");
		user2.setPassword("123456");
		System.out.println(user2.getUsername() + " " + 
						   user2.getPassword());
	}
}
