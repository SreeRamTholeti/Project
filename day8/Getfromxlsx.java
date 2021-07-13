package Task_8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getfromxlsx{
	File file = new File("D:\\WorkSpace\\Day8\\src\\Task_8\\Names.xlsx");
	public int get_rowcount() throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Integer row_count = sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return(row_count);
	}
	public void savingtoxlsx(String set[],int size) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet_0 = workbook.getSheetAt(0);
		XSSFSheet sheet_1 = workbook.createSheet("My_newsheet");
		String heading []={"Number","serial_No.","Name"};
		int i,j,k,row_num,col_num,h_size=heading.length;
		XSSFRow row,row_0;
		CellType cell_type;
		for(i=0;i<size;i++) {
			
			row_num = Integer.valueOf(set[i]);
			row_0 = sheet_0.getRow(row_num);
			col_num = row_0.getLastCellNum();
			if(i == 0) {
				row = sheet_1.createRow(i); 
				for(k=0;k<h_size;k++) {
					row.createCell(k).setCellValue(heading[k]);
				}	
			}
			row = sheet_1.createRow(i+1);
			for(j=0;j<col_num;j++) {
				row.createCell(0).setCellValue(set[i]);
				cell_type = row_0.getCell(j).getCellType();
				switch(cell_type) {
				case STRING:row.createCell(j+1).setCellValue(row_0.getCell(j).getStringCellValue()); break;
				case NUMERIC:row.createCell(j+1).setCellValue(row_0.getCell(j).getNumericCellValue());break;
				default :row.createCell(j+1).setCellValue("");break;
				}
			}
		}
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
	}
}
