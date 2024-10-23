package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebElements {
	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lightinthebox.com/");
		driver.manage().window().maximize();
		
		//Xpath by href Attribute:To locate the hyperlink button based on its href attribute
		//*[@id="uni-header"]/div[2]/ul/li[2]/a
		driver.findElement(By.xpath("//*[@id=\"uni-header\"]/div[2]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//a[@href ='https://www.lightinthebox.com/search?q=Mens+t+shirts&query_type=1]")).click();
		Thread.sleep(2000); //                  https://www.lightinthebox.com/search?q=Mens+t+shirts&query_type=1
		//Using position(): it selects the elements based on position number ex: instead of 2 
		//driver.findElement(By.xpath("/html/body/header/div/div[3]/header/div/div/div[2]/div[1]/div/a[5]")).click();
		
		driver.findElement(By.xpath("//a[@href=https://www.lightinthebox.com/c/cotton%20&%20linen_120371]")).click();
				 
		System.out.print("T shirt Men Cotton");
}
	
}

//href 
// https://www.lightinthebox.com/search?q=Mens+t+shirts&query_type=1