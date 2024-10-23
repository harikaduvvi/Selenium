package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class Microsoft_Edge {
		static WebDriver driver;
		public static void main(String[] args) {
			driver = new EdgeDriver();
			System.setProperty("webdriver.Microsoftedge.driver", "D:\\Selenium\\Drivers\\Microsoft edge.exe");
				driver.get("https://www.bing.com/search?pglt=41&q=maven+dependency&cvid=74007d4b55ab4e27bdab7773e6f07871&gs_lcrp=EgZjaHJvbWUqBggEEAAYQDIGCAAQRRg5MgYIARAAGEAyBggCEAAYQDIGCAMQABhAMgYIBBAAGEAyBggFEAAYQDIGCAYQABhAMgYIBxAAGEAyBggIEAAYQNIBCDU0OTVqMGoxqAIAsAIA&FORM=ANSPA1&PC=HCTS");
				}
			}
