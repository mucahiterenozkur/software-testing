package q1;


import org.junit.Assert;
import org.junit.Test;


public class UserDetailsJunitTest {

	@Test
	public void test() {
		UserDetails ud = new UserDetails();
		
		String name = ud.GetUsername();
		int usernameLength = name.length();
		//Assert.assertTrue(usernameLength <= 10);
		
		String pass = ud.GetPassword();
		int passwordLength = pass.length();
		//Assert.assertTrue(passwordLength < 10 && passwordLength > 5);
		
		ud.GetProfilePhoto();
		Assert.assertTrue((usernameLength <= 10) && (passwordLength < 10 && passwordLength > 5) 
						&& (ud.size < 20 && ud.size > 0) 
						&& (ud.format.equals(".jpg") || ud.format.equals(".jpeg")));

	}

}
