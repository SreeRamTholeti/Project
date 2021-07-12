package Task_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Modifyxlsx {
	File file = new File("D:\\WorkSpace\\Day8\\src\\Task_8\\Names.xlsx");
	
	String get_rowcount() throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Integer row_count = sheet.getLastRowNum();
		return(row_count.toString());
	}
	void Create_newSheet() throws Exception{
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("My_Sheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Number");
		sheet.getRow(0).createCell(1).setCellValue("Serial No.");
		sheet.getRow(0).createCell(2).setCellValue("Name");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
	}
	String get_Stringvalues(int row_num) throws Exception{
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(row_num);
		return(row.getCell(1).getStringCellValue());
	}
	String get_Integervalues(int row_num) throws Exception{
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	XSSFRow row = sheet.getRow(row_num);
	return(row.getCell(0).getRawValue());
}
}
