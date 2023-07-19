package day10.practice;

import java.util.ArrayList;
import java.util.Objects;

class User {
	private int id;
	private String name;
	private String emailId;
	public User(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.emailId = email;
	}
    // Override the equals method to compare the fields of User objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name) && emailId.equals(user.emailId);
    }

    // Don't forget to override hashCode whenever you override equals
    @Override
    public int hashCode() {
        return Objects.hash(id, name, emailId);
    }
}


class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String message) {
		super(message);
	}
}

public class UserExist {
	public static ArrayList<User> user = new ArrayList<User>();

	public static boolean register(User user) throws UserAlreadyExistsException {
		if (UserExist.user.contains(user)) {
			throw new UserAlreadyExistsException("User already exist");
		}
		UserExist.user.add(user);
		return true;
	}

	public static void main(String[] args) throws UserAlreadyExistsException {
		User user1 = new User(1,"pranaw","pmurugesan@fssa.fresworks.com");
		User user2 = new User(1,"pranaw","pmurugesan@fssa.fresworks.com");
		try {
			register(user1);
			register(user2);
		} catch (UserAlreadyExistsException e) {
			throw new UserAlreadyExistsException(e.getMessage());
		}
	}
}
