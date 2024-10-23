package SeleniumBasics;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserCommand2 {
		public static void main(String[] args) {
			String driverExecutablePath = "D:\\Selenium\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverExecutablePath);
			WebDriver driver = new ChromeDriver();
			String url = "https://www.lightinthebox.com";
			driver.get(url);
			String title = driver.getTitle();
			int titleLength = driver.getTitle().length();
			
			//PrINTING Title & Title Length
			System.out.println("Title of the page is :" +title);
			System.out.println("Length of the title is :" +titleLength);
			
			String ExpectedUrl = "https://www.lightintheeboxx.com";
			String actualUrl = driver.getCurrentUrl(); // it fetches the title of the current page
			if (actualUrl.equals(url))
			{
				System.out.println("Verification successful - The correct url is opened");
			}
				else {
					System.out.println("Verification failed - The incorrect url is opened");
			//In case fail , you like to print actual & expected url for the record purpose
					System.out.println("Actual url is:" +actualUrl);
						System.out.println("Expected url is:" +ExpectedUrl);
				}
			//Storing page source in string variable 
				String PageSource = driver.getPageSource(); // it returns the source code of the page
				
				//Storing page source length in int variable 
				int pageSourceLength = driver.getPageSource().length();
				System.out.println("Total length of the page source is:" +pageSourceLength);
				driver.close();
	}
	}
