package MyDemo2.MyDemo2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Winodws {
	WebDriver drive;
  @Test
  public void f() throws InterruptedException {
	  drive = Drivers.getDriver("Chrome");
	  drive.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  drive.get("http://10.232.237.143:443/TestMeApp/");
	  String P_win = drive.getWindowHandle();
	  System.out.println(P_win);
	  Thread.sleep(5000);
	  drive.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span")).click();
	  drive.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
	  drive.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
//	  String C_win = drive.getWindowHandle();
//	  System.out.println(C_win);
	  Set<String> T_win = drive.getWindowHandles();
	  for(String S : T_win) {
		  drive.switchTo().window(S);
		  System.out.println(drive.getWindowHandle());
	  }
	  drive.switchTo().frame(drive.findElement(By.name("main_page")));
	  WebElement El1 = drive.findElement(By.tagName("address"));
	  String str = El1.getText();
	  System.out.println(str);
  }
}

