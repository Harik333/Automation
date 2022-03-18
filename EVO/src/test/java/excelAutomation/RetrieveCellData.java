package excelAutomation;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class RetrieveCellData {
	
	@Test
	public void cellData() throws Exception {
		
		String dirPath = System.getProperty("user.dir")+"\\ExcelFiles\\TestDataFile.xlsx";
		FileInputStream Infile = new FileInputStream(dirPath);
		XSSFWorkbook excelFile = new XSSFWorkbook(Infile);
		XSSFSheet sheetName = excelFile.getSheet("LoginData");
		System.out.println("RowCount: "+ sheetName.getPhysicalNumberOfRows()); 
		//readData
		System.out.println("UserName for TestCase1 login:" + sheetName.getRow(1).getCell(2)); 
		System.out.println("Password for TestCase1 login:" + sheetName.getRow(2).getCell(2));
		
		double id = sheetName.getRow(3).getCell(2).getNumericCellValue();
		System.out.println(id);				
		
		//User DataFormatter to treat any cell type(numeric, string, alphanumeric) as String
		DataFormatter objFormat = new DataFormatter();
		String UniqueIDD = objFormat.formatCellValue(sheetName.getRow(4).getCell(2));
		System.out.println("UniqueID is: " + UniqueIDD);
		
		
	}
	

}
