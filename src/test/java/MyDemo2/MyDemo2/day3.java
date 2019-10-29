package MyDemo2.MyDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day3 {
	WebDriver drive;
	
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
//  @Test (groups = {"regression","smoke"})
//  public void addtocart() {
//	  System.out.println("this is my smoke test case");
//  }  @Test (groups = "smoke")
//  public void payment() {
//	  System.out.println("this is my smoke test case");
//  }
//  @AfterTest 
//  public void logout() {
//	  drive.findElement(By.name("login")).click();
//	  drive.close();
//  }
//  @BeforeTest
//  	public void launch_app(){
//	  drive = Drivers.getDriver("Chrome");
//	  drive.get("http://www.newtours.demoaut.com/");
//  }
//  
//@DataProvider
//public Object[][] dp() {
//  return new Object[][] {
//    new Object[] { "demo", "demo" },
//    new Object[] { "mercury", "mercury" },
//  };
//}
}


