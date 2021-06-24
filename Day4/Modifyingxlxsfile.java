package Task4;
import java.io.*;
import java.util.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Modifyingxlxsfile {
	public static void main(String [] args) throws Exception {
		File file = new File("D:\\WorkSpace\\Day4\\src\\Task4\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int row_count = sheet.getPhysicalNumberOfRows();
		
		Handlingxlsx hxl = new Handlingxlsx();
		List<Date> date = hxl.Reading(sheet,row_count);
		
		sheet.getRow(0).createCell(2).setCellValue("MM/dd/yyyy Formate");
		sheet.getRow(0).createCell(3).setCellValue("yyyy/MM/dd Formate");
		
		Formatingdate ob = new Formatingdate();
		String[] date1 = ob.Formate_1(date,row_count);
		String[] date2 = ob.Formate_2(date,row_count);
		
		FileOutputStream fos = new FileOutputStream(file);
		hxl.Writing(sheet, fos, workbook, date1, date2, row_count);
		fis.close();
		fos.close();
	}
}
