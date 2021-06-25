package pak5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Opencsv {
	
	XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Sheet_Number1");
    
	boolean readcsv(String path) throws Exception{
		String row;
		int rownum=0,j;
		BufferedReader br = new BufferedReader(new FileReader(path));
		Toxlsx txl = new Toxlsx();
		
		Font headerfont = workbook.createFont();
		headerfont.setBold(true);
		headerfont.setColor(IndexedColors.DARK_BLUE.getIndex());
		CellStyle headstyle =	workbook.createCellStyle();
	    	headstyle.setFont(headerfont);
	    	Row head = sheet.createRow(0);
	    
		while((row = br.readLine()) != null)
		{
			if(rownum == 0) {txl.inserthead(row, head,headstyle);rownum++;}
			txl.insert(row, rownum, sheet);
			rownum++;
		}
		
		FileOutputStream fos = new FileOutputStream(new File("D:\\WorkSpace\\Day5\\src\\pak5\\user.xlsx"));
		workbook.write(fos);
		workbook.close();
	    return(true);
		
	}
}
