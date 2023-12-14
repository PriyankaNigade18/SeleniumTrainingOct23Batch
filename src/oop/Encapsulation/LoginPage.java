package oop.Encapsulation;

public class LoginPage 
{
	//data
	private String username;
	private String password;
	
	//public Methods
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Business Logic
	public void doLogin(String un,String psw)
	{
		System.out.println("Hello! You are loged in with: "+un);
	}
	
	
	
	
	

}
