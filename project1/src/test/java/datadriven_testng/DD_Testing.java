package datadriven_testng;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DD_Testing {
	WebDriver z;
	
	@BeforeTest
	public void browser() throws InterruptedException {
		z= new FirefoxDriver();
		z.manage().window().maximize();
		Thread.sleep(1000);
	}
	@AfterTest
	public void af() {
		z.quit();
		
	}
  @Test
  public void f() {
	  try //.xls(old format 97 2003), .xlsx(new format)
	  {
	FileInputStream fileObj = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\project1\\src\\test\\java\\datadriven_testng.xlsx");
	XSSFWorkbook workBookObj = new XSSFWorkbook(fileObj);
	XSSFSheet sheetObj = workBookObj.getSheet("Sheet1");
	String url;
	String fname;
	String lname;
	//i= 1 T i+1 --> 1+1 =2 -->i=3 3+1=4....
	for(int i=1; i<=sheetObj.getLastRowNum(); i++)
	{
		XSSFRow r = sheetObj.getRow(i);
		url = r.getCell(0).toString();
		z.get(url);
		WebElement fn = z.findElement(By.id("firstName"));
		fn.clear();
		fname = r.getCell(1).toString();
		fn.sendKeys(fname);
		Thread.sleep(1000);
		WebElement next_btn = z.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
			WebElement ln = z.findElement(By.xpath("//*[@id=\"lastName\"]"));
			ln.clear();
			lname= r.getCell(2).toString();
			ln.sendKeys(lname);
			WebElement pw = z.findElement(By.className("CwaK9"));
			//pw.click();
			z.close();
	}
		  fileObj.close();
	  }
	  catch (Exception ex) {
		  System.out.println(ex);
}
	  z.quit();
}
}
