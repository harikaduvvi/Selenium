package Window_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleswitch {
		
		public static void main(String[]args) throws InterruptedException{
			WebDriver d;
			d= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64.exe");  // to copy the path : Shift+Right click  on chrome driver copy as path 
			d.manage().window().maximize();
			d.get("http://omayo.blogspot.com/");
			
			//write code here 
	      String  firstwindow = d.getWindowHandle();  // it returns current window 
		  WebElement openpopup=d.findElement(By.linkText("Open a popup window"));
	      JavascriptExecutor js =  (JavascriptExecutor)d;
	      js.executeScript("arguments[0].scrollIntoView();",openpopup );//This will scroll the page till the element is found	
	      Thread.sleep(5000);
		  openpopup .click();
		  Thread.sleep(5000);
		  
			Set<String> secondwindows = d.getWindowHandles();// it returns all windows ex: 2nd window 
			for(String handle:secondwindows) {   // for loop return list of window handles 
				d.switchTo().window(handle); // it switch from the parent window to the child window
				System.out.println("window 2");	
				d.close();
			}
			
			  d.close(); // note: without window handle 2nd window will not close 
//	 	      d.switchTo().window(firstwindow);// it switch from the chaild window to the parent window
		}
	}
