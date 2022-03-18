package excelAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Constrain {
	
	@Test
	public void FilterExcel() throws IOException {
		String dirPath = System.getProperty("user.dir")+"\\ExcelFiles\\TestDataFile.xlsx";
		
		XSSFWorkbook excelFile = new XSSFWorkbook(dirPath);
		XSSFSheet sheetName = excelFile.getSheet("Table");
		
		
		
		
	}

}
