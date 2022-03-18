package excelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteCellData {
	
	@Test
	public void writeCellData() throws IOException {
		String dirPath = System.getProperty("user.dir")+"\\ExcelFiles\\WriteDataFile.xlsx";
		File f = new File(dirPath);
		FileInputStream Infile = new FileInputStream(f);
		XSSFWorkbook excelFile = new XSSFWorkbook(Infile);
		XSSFSheet sheetName = excelFile.getSheet("Table");
		
		XSSFCell cell = sheetName.getRow(2).getCell(2);
		double age  = cell.getNumericCellValue();
		int agee = (int)age;
				
		System.out.println(agee);		       

		
		//Create row and cell, then update value
		XSSFRow newR = sheetName.createRow(10);
		XSSFCell newC = newR.createCell(3);
		
		newC.setCellValue("Ramesh");
		
		
	    FileOutputStream outFile = new FileOutputStream(f);
	    excelFile.write(outFile);
	    outFile.close();
	    			
		
	}

}
