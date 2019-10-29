package MyDemo2.MyDemo2;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelDemo {
	WebDriver drive;

	@Test
  public void Registration() throws IOException, InterruptedException {
		//drive.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		drive = Drivers.getDriver("Chrome");
		drive.get("http://demowebshop.tricentis.com/");
		drive.manage().window().maximize();
	  File f1 = new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Exceldemo.xlsx");
	  FileInputStream FIS = new FileInputStream(f1);
	  XSSFWorkbook wb = new XSSFWorkbook(FIS);
	  XSSFSheet sh = wb.getSheetAt(0);
	  int R_cnt  = sh.getLastRowNum();
	  
	  //System.out.println(R_cnt);
	  for (int i =0;i<=R_cnt;i++) {
		  drive.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		  Thread.sleep(5000);
		  drive.findElement(By.xpath("//input[@value=\"M\"]")).click();//gender
		  String fname = sh.getRow(i).getCell(0).getStringCellValue();
		  drive.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys(fname);//first name
		  String lname =  sh.getRow(i).getCell(1).getStringCellValue();
		  drive.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys(lname);//lastname
		  String Email = sh.getRow(i).getCell(2).getStringCellValue();
		  drive.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(Email);//email
		  String pass = sh.getRow(i).getCell(3).getStringCellValue();
		  System.out.println("pass");
		  drive.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(pass);//password
		  drive.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(pass);//cpassword
		  drive.findElement(By.xpath("//input[@value = 'Register']")).click();
		  drive.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		  drive.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		  //sh.getRow(i).createCell(2).setCellValue("Dota");
//		  FileOutputStream Fout = new FileOutputStream(new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Exceldemo.xlsx"));
//		  wb.write(Fout);
	  }
	  wb.close();
  }
}
