package MyDemo2.MyDemo2;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class localExcel {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook wb = new XSSFWorkbook();
	  FileOutputStream fout = new FileOutputStream(new File("demoExcel1.xlsx"));
	  wb.write(fout);
	  wb.close();
  }
}
