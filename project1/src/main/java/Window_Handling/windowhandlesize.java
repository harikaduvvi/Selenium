package Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesize {
		
		public static void main(String[]args) throws InterruptedException {
			WebDriver d;
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path and paste it  
			d= new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.kotak.com/en/home.html");	
			d.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
			System.out.println("current window:"+d.getWindowHandle());
			Thread.sleep(1000);
			Set<String> secondwindow = d.getWindowHandles();
			for(String handle:secondwindow) {   // for loop return list of window handles 
				System.out.println(handle);	
			}
			
		}
	}

