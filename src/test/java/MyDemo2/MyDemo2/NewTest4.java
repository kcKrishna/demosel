package MyDemo2.MyDemo2;

import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class NewTest4 {
	WebDriver drive;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  drive = Drivers.getDriver("Chrome");
	  drive.get("http://www.newtours.demoaut.com/");
	  drive.findElement(By.name("userName")).sendKeys(n);
	  drive.findElement(By.name("password")).sendKeys(s);
	  drive.findElement(By.name("login")).click();
	  drive.close();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
