package simple.project.stub;

import simple.project.beans.User;
import simple.project.beans.UserLoginInput;

public class StubbedUsers {
	
	//So che non si deve scrivere in chiaro la password, ma siamo in un esempio, andiamo...
	public static final User USER1 = new User("User", "One", "userone", "Italy", "1990");
	public static final User USER2 = new User("User", "Two", "usertwo", "United States", "1991");
	
	public static final UserLoginInput USERLOGIN1 = new UserLoginInput("userone", "password1");
	public static final UserLoginInput USERLOGIN2 = new UserLoginInput("usertwo", "password2");
}
