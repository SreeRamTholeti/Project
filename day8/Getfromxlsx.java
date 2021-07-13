package Task_8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getfromxlsx{
	static File file = new File("D:\\WorkSpace\\Day8\\src\\Task_8\\Names.xlsx");
	//Geting number of rows
	public int get_rowcount() throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Integer row_count = sheet.getLastRowNum();
		workbook.close();
		return(row_count);
	}
	//geting cellvalues
	public static String get_Cellvalue(int row_num,int col_num) throws Exception {
		String cell_value = "";
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(row_num);
		CellType cell_type = row.getCell(col_num).getCellType();
		switch(cell_type) {
		case STRING:cell_value = row.getCell(col_num).getStringCellValue(); break;
		case NUMERIC:
			Integer value = (int)row.getCell(col_num).getNumericCellValue();
			cell_value =  value.toString();
			break;		
		}
		return (cell_value);
	}
	//Creating new sheet with headings
	void Create_newSheet() throws Exception{
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("New_Sheet");
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
	//setting values to new sheet
	void save_to_sheet(String set[],int size) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet_2 = workbook.getSheet("New_Sheet");
		int i,row_num;
		XSSFRow row;
		String value_2,value_1;
		for(i=0;i<size;i++) {
			row = sheet_2.createRow(i+1);
			row_num = Integer.valueOf(set[i]);
			value_1 = get_Cellvalue(row_num,0);
			value_2 = get_Cellvalue(row_num,1);
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
