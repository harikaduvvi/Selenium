package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelUtils_WithHardcoding {
  public FileInputStream file = null;
  private XSSFWorkbook ExcelWBook = null;
  private static XSSFSheet sheet = null;
  static int rowcount = 0;
  static int colcount = 0;
  static String cellData = null;
  // static XSSFWorkbook ExcelBook;
  // static XSSFSheet sheet;
  // static int rowcount = 0;
  // static String cellData = null;
  
  public excelUtils_withOutHardCoding(String excelPath, String sheetName) {
	  try {
		  file = new FileInputStream(excelPath);
		  ExcelWBook = new XSSFWorkbook(file);
		  sheet = ExcelWBook.getSheet(sheetName);
	  }
	  catch (Exception e) {
		  e.getMessage();
		  e.getCause();
	  }
  }
  public int getRowCount() throws IOException{
	  rowcount = sheet.getPhysicalNumberOfRows();
	  System.out.println("no of col :" +colCount);
	  return colCount;
	  }
  public static String getCellData(int rowNum, int colNum) throws IOException{
	  cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	  //getStringCellValue
  }
}
