package Webdrivers;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Savingtoxlsx {
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("GitResopositories");
	void createhead() {
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Serial Number");
		sheet.getRow(0).createCell(1).setCellValue("Repository Name");
	}
	void push(String str,int rownum) {
		//System.out.println(rownum+"\n"+str);
		if(str != null) {
			sheet.createRow(rownum);
			sheet.getRow(rownum).createCell(0).setCellValue(rownum);
			sheet.getRow(rownum).createCell(1).setCellValue(str);
		}
	}
	boolean Save() throws IOException{
		FileOutputStream fos = new FileOutputStream(new File("D:\\WorkSpace\\day7\\src\\Webdrivers\\GitHub.xlsx"));
		workbook.write(fos);
		workbook.close();
		return true;
	}
}
