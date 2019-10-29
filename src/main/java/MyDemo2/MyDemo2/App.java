package MyDemo2.MyDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver KC;
		System.setProperty("webdriver.ie.driver", "C:\\MyDrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		KC = new InternetExplorerDriver();
		KC.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		// login
		WebElement login = KC.findElement(By.linkText("Log in")); 
		login.click();
		WebElement Uname = KC.findElement(By.name("Email"));
		Uname.sendKeys("kronos@gmail.com");
		WebElement pass = KC.findElement(By.name("Password"));
		pass.sendKeys("Pass123");
		WebElement sub = KC.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		sub.click();
		String A_title = KC.getTitle();
		String E_title = "Demo Web Shop";
		Assert.assertEquals(E_title, A_title);
		System.out.println("login successful");
		
		
    }
}
