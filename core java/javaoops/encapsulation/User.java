package javaoops.encapsulation;

public class User {
	private String username;
	private String password;
	
	//setters
	public void setUsername(String username){
		this.username = username;		
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	//getters
	public String getUsername(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public boolean isUserExist(){
		if(this.username.equals("admin") && this.password.equals("admin123")) {
			return true;
		}else {
			return false;
		}
	}
}
