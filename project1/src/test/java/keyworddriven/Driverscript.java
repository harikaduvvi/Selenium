package keyworddriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class Driverscript {
	  @Test
	  public void main() throws IOException, InterruptedException {
		  String EPath = "C:\\Users\\HP\\eclipse-workspace\\project1\\src\\test\\java\\keyworddriven.xlsx";
		  ExcelUtils.setExcelFile(EPath, "Sheet1");
	  for(int iRow=1;iRow<=7;iRow++) {
		  String aActionKeyWord = ExcelUtils.getCellData(EPath, iRow, 3);
		  if(aActionKeyWord.equals("openBrowser")); 
		 actionkeyword.openBrowser();
		 if(aActionKeyWord.equals("openURL")); 
		 actionkeyword.openURL();
		 if(aActionKeyWord.equals("Input_Username")); 
		 actionkeyword.Input_Username();
		 if(aActionKeyWord.equals("Input_Password")); 
		 actionkeyword.Input_Password();
		 if(aActionKeyWord.equals("Click_LogIn")); 
		 actionkeyword.Click_LogIn();
		 if(aActionKeyWord.equals("Close_Driver"));
		 actionkeyword.Close_Driver();
		 }
	  }
	  }
