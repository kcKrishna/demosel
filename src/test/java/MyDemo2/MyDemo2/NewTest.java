package MyDemo2.MyDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
		WebDriver KC;
		System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		KC = new ChromeDriver();
		KC.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		Thread.sleep(5000);
		// login
		WebElement login = KC.findElement(By.linkText("REGISTER")); 
		login.click();

		WebElement fname = KC.findElement(By.name("firstName"));
		fname.sendKeys("wraith");
		WebElement lname = KC.findElement(By.name("lastName"));
		lname.sendKeys("king");
		WebElement phno =  KC.findElement(By.name("phone"));
		phno.sendKeys("9849221114");
		WebElement add=  KC.findElement(By.name("address1"));
		add.sendKeys("alwal");
		WebElement city=  KC.findElement(By.name("city"));
		city.sendKeys("hyderabad");
		WebElement state =  KC.findElement(By.name("state"));
		state.sendKeys("Telangana");
		WebElement pin=  KC.findElement(By.name("postalCode"));
		pin.sendKeys("500010");
		WebElement Uname = KC.findElement(By.xpath("//input[@name = 'email']"));
		Uname.sendKeys("wraith");
		WebElement pass = KC.findElement(By.xpath("//input[@name = 'password']"));
		pass.sendKeys("king");
		WebElement country  = KC.findElement(By.xpath("//select[@name = 'country']"));
		Select sel1 = new Select(country);
		sel1.selectByVisibleText("INDIA");
		WebElement submit = KC.findElement(By.xpath("//input[@name =\"register\"]"));
		submit.click();
  }
}
