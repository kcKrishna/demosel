package MyDemo2.MyDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest2 {
  static WebDriver driver;
	@Test
  public void f() {
	 driver = Drivers.getDriver("Chrome");
	 driver.get("https://www.facebook.com/");
	 //driver.findElement(By.name("Create New Account")).click();
	 driver.findElement(By.name("firstname")).sendKeys("wraith");
	 driver.findElement(By.name("lastname")).sendKeys("king");
	 driver.findElement(By.name("reg_email__")).sendKeys("wraith@king.com");
	 WebElement date = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
	 WebElement month = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
	 WebElement year = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
	 Select sel1 = new Select(date);
	 sel1.selectByVisibleText("18");
	 Select sel2 = new Select(month);
	 Select sel3 = new Select(year);
	 sel2.selectByVisibleText("Jan");
	 sel3.selectByVisibleText("1996");
	 WebElement gender = driver.findElement(By.xpath("//input[@value  = '2'and @type = 'radio'] "));
	 gender.click();
	}
}
