package excelAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class RowAndColumnCount {
	
	@Test
	public void writeCellData() throws IOException {
		String dirPath = System.getProperty("user.dir")+"\\ExcelFiles\\WriteDataFile.xlsx";
		InputStream Infile = new FileInputStream(dirPath);
		XSSFWorkbook excelFile = new XSSFWorkbook(Infile);
		
		XSSFSheet sheet = excelFile.getSheet("LoginData");
		
		int RowCount = sheet.getLastRowNum();  //gives row count starting from 0, SO VALUE IS ALWAYS ONE LESS
		int PhysicalRowCount = sheet.getPhysicalNumberOfRows(); // gives perfect row count. Starts from 1
		System.out.println(RowCount);
		System.out.println(PhysicalRowCount);
		
		int ColCount = sheet.getRow(0).getLastCellNum(); //Couting starts from 0
		int ColCountPhysical = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(ColCount);
		System.out.println(ColCountPhysical);
		

		
	}

}