package model;

public class User {

	private static String userName;
	private String password;
	
	public User() {
	}
	
	public User(String userName,String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public static String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
