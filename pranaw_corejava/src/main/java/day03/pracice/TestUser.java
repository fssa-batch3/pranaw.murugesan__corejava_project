package day03.pracice;


public class TestUser{
	public static void main(String[] args) {
//		instantiate object
		User user = new User();
		User user1 = new User("Pranaw","passwordSollaMaaten","pranaw.murugesan@fssa.freshworks.com");
	}
}
class User {
//	declaring methods
	private String name;
	private String password;
	private String emailId;
	
//	default constructor
	User(){}
	
//	overloaded constructor
	User(String name, String password, String emailId){
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
}
