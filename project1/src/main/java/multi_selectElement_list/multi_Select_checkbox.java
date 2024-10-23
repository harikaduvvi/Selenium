package multi_selectElement_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_Select_checkbox {
	public static void main(String[] args) {
		try {
			
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
    
	WebDriver d = new ChromeDriver();
	d = new ChromeDriver();
    d.manage().window().maximize();
    //d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    d.get("https://www.ironspider.ca/forms/checkradio.htm");
    //String checkToBeSelected = "Blue";
    List<WebElement> checkList = d.findElements(By.name("color"));
    System.out.println("number of checkbox present in webpage :" +checkList);
    for(int i=0; i<checkList.size();i++) {
    	//if(checkList.get(i).getAttribute("value").equalsIgnoreCase(checkList);
    	//{
    		checkList.get(i).click();
    		Thread.sleep(2000);
    		//break;
    	//}
    	//d.close();
    }
}
    catch(Exception e) {
    	System.out.println(e);
}
}
}
