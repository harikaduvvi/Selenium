package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static WebDriver driver;
	static WebElement FirstName;
	static String URL;
	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		URL ="https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20new%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-298831213137%26loc_physical_ms%3D9182462%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQjw1qO0BhDwARIsANfnkv9DwSvfdJXNhvTV1eQjE46x-cLCeGSdlm4I3dEPBsiyLDzsiie3CKkaAgbDEALw_wcB";
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FirstName =driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Harika");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Duvvi");
		driver.findElement(By.name("reg_email__")).sendKeys("harika@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("harika@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Harika@123");
	}

}


