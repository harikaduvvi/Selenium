package keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;


public class ExcelUtils{
	 private static XSSFWorkbook ExcelWBook;
	  private static XSSFSheet ExcelWSheet;
	  private static XSSFCell Cell;
@Test
  public  void setExcelFile(String Path, String SheetName) throws IOException {
	  FileInputStream ExcelFile = new FileInputStream(Path);
	  ExcelWBook = new XSSFWorkbook(ExcelFile);
	  ExcelWSheet = ExcelWBook.getSheet(SheetName); 
  }
  public  static String getCellData(String Purpose, int RowNum,int ColNum) {
	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	  String CellData = Cell.getStringCellValue();
	  return CellData;
	  }
}