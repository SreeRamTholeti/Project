package Task4;
import java.io.*;
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
		sheet.getRow(0).createCell(2).setCellValue("MM/dd/yyyy Formate");
		sheet.getRow(0).createCell(3).setCellValue("yyyy/MM/dd Formate");
		Formatingdate ob = new Formatingdate();
		String[] date1 = ob.Formate_1(date,row_count);
		String[] date2 = ob.Formate_2(date,row_count);
		for(i=1;i<row_count;i++)
		{
			sheet.getRow(i).createCell(2).setCellValue(date1[i]);
			sheet.getRow(i).createCell(3).setCellValue(date2[i]);
		}
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
	}
}
