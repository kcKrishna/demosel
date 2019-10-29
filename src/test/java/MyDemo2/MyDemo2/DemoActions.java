package MyDemo2.MyDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActions {
	WebDriver drive;
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  drive = Drivers.getDriver("Chrome");
	  drive.get("http://demowebshop.tricentis.com/");
	  WebElement El1 = drive.findElement(By.xpath("//input[@id = 'small-searchterms']"));
	  Actions act1 = new Actions(drive);
	  act1.keyDown(El1,Keys.ALT).sendKeys("build your own").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(5000);
	  act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
  }

@Test
public void g() throws InterruptedException {
	  drive = Drivers.getDriver("Chrome");
	  drive.get("https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetbrandbmm&gclid=EAIaIQobChMIto3jlYuv5QIVkRiPCh3lBwxaEAAYASAAEgK3uvD_BwE");
//	  WebElement El1 = drive.findElement(By.xpath("//a[text() = 'Add-Ons']"));
//	  WebElement El2 = drive.findElement(By.xpath("//a[text() = 'SpiceBiz']"));
	  Actions act1 = new Actions(drive);
//	  act1.moveToElement(El1).build().perform();
//	  Thread.sleep(5000);
//	  //act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//	  El2.click();
	  WebElement El1_check = drive.findElement(By.xpath("//input[@id ='ctl00_mainContent_chk_friendsandfamily']"));
	  WebElement El1_drop = drive.findElement(By.xpath("//input[@id ='ctl00_mainContent_chk_friendsandfamily']"));
	  WebElement El1_but = drive.findElement(By.xpath("//input[@id ='ctl00_mainContent_chk_friendsandfamily']"));
	  
	  
}
}