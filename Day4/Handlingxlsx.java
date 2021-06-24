package Task4;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handlingxlsx {
	int i;
	List<Date> Reading (XSSFSheet sheet,int length) 
	{
		List<Date> date = new ArrayList<Date>();
		for(i=1;i<length;i++)
		{
			XSSFRow row = sheet.getRow(i);
			date.add(row.getCell(1).getDateCellValue());
		}
		return date;
	}
	
	void Writing(XSSFSheet sheet,FileOutputStream fos,XSSFWorkbook workbook,String s1[],String s2[],int length) throws Exception
	{
		sheet.getRow(0).createCell(2).setCellValue("MM/dd/yyyy Formate");
		sheet.getRow(0).createCell(3).setCellValue("yyyy/MM/dd Formate");
		for(i=1;i<length;i++)
		{
			sheet.getRow(i).createCell(2).setCellValue(s1[i]);
			sheet.getRow(i).createCell(3).setCellValue(s2[i]);
		}
		workbook.write(fos);
		workbook.close();
	}
}
