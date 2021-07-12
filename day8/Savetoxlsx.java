package Task_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Savetoxlsx {
	File file = new File("D:\\WorkSpace\\Day8\\src\\Task_8\\Names.xlsx");
	Modifyxlsx mx = new Modifyxlsx();
	void save_to_sheet(String set[],int size) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet_2 = workbook.getSheet("My_Sheet");
		//int value_1;
		int i,row_num;
		XSSFRow row;
		String value_2,value_1;
		for(i=0;i<size;i++) {
			row = sheet_2.createRow(i+1);
			row_num = Integer.valueOf(set[i]);
			value_1 = mx.get_Integervalues(row_num);
			value_2 = mx.get_Stringvalues(row_num);
			row.createCell(0).setCellValue(set[i]);
			row.createCell(1).setCellValue(value_1);
			row.createCell(2).setCellValue(value_2);
		}
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
	}
}
