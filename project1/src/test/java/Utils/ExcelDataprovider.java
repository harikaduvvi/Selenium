package Utils;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
    WebDriver driver;

    @BeforeTest
    public void setUpTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_workspace\\chromedriver.exe");
        driver = new ChromeDriver();
        }
    @Test(dataProvider = "test1data")
    public void test1(String uname, String pwd) {
        System.out.println("Username: " + uname + " Password: " + pwd);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys(uname);
        driver.findElement(By.name("lastname")).sendKeys(pwd);
    }

    @DataProvider(name = "test1data")
    public static Object[][] getData() throws IOException {
        String excelPath = "C:\\Users\\HP\\eclipse-workspace\\project1\\src\\test\\java.xlsx";
        return testData(excelPath, "Sheet1");
    }

    public static Object[][] testData(String excelPath, String sheetName) throws IOException {
        excelUtils_WithoutHardCoding excel = new excelUtils_WithoutHardCoding(excelPath, sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excel.getCellData(i, j);
                System.out.println(cellData);
                data[i - 1][j] = cellData;
            }
        }
    return data;
}
}

