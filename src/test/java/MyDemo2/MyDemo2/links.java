package MyDemo2.MyDemo2;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class links {
	public static void main (String[] args) {
		WebDriver drive;
		drive = Drivers.getDriver("Chrome");
		drive.get("http://newtours.demoaut.com/mercurywelcome.php");
		List<WebElement> links = drive.findElements(By.tagName("a"));
		int count = links.size();
		for (int i=0; i<count;i++) {
			String str = links.get(i).getText();
			System.out.println(str);
		}
		WebDriverWait wt1 = new WebDriverWait(drive,60);
		wt1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
	}
}
