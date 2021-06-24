package Task4;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Modifyingxlxsfile {
	public static void main(String [] args) throws Exception {
		File file = new File("D:\\WorkSpace\\Day4\\src\\Task4\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int i,j;
		List<Date> date = new ArrayList<Date>();
		int row_count = sheet.getPhysicalNumberOfRows();
		for(i=1;i<row_count;i++)
		{
			XSSFRow row = sheet.getRow(i);
			date.add(row.getCell(1).getDateCellValue());
		}
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat formatter_1 = new SimpleDateFormat("dd MMMM yyyy");
		sheet.getRow(0).createCell(2).setCellValue("MM/dd/yyyy Formate");
		sheet.getRow(0).createCell(3).setCellValue("dd MMMM yyyy Formate");
		for(i=1;i<row_count;i++)
		{
			sheet.getRow(i).createCell(2).setCellValue(formatter.format(date.get(i-1)));
			sheet.getRow(i).createCell(3).setCellValue(formatter_1.format(date.get(i-1)));
		}
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
		
	}
}
