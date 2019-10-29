package MyDemo2.MyDemo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewTest5 {
	  @Test//(groups = "sanity",invocationCount = 10)
	  @Parameters({"username","password"})
	  public void login(String username, String password) {
		  System.out.println(username);
		  System.out.println(password);
	  }
	  @Test //(groups = {"regression","sanity"})
	  @Parameters({"username","password"})
		  public void searchItem(String username, String password) {
		  System.out.println(username);
		  System.out.println(password);
		  }
}
