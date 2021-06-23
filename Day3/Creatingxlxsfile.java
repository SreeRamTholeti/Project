package day3;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Creatingxlxsfile {
	public static void main(String [] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet_Number1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Name");
		sheet.getRow(0).createCell(1).setCellValue("Emp_id");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("GuruSreeRam");
		sheet.getRow(1).createCell(1).setCellValue(1926787);
		
		FileOutputStream fos = new FileOutputStream(new File("D:\\WorkSpace\\day3\\src\\day3\\Sample1.xlxs"));
		workbook.write(fos);
		workbook.close();
		System.out.println("Done.");
	}
}
