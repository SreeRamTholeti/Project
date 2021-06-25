package pak5;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Toxlsx {
	int j;    
	void inserthead(String s,Row head,CellStyle headstyle) {
		String [] a = s.split(";");
		for(j=0;j<a.length;j++) {
			Cell cell = head.createCell(j);
			cell.setCellValue(a[j]);
			cell.setCellStyle(headstyle);
		}
	}
	void insert(String str,int rownum,XSSFSheet s){
		String [] array = str.split(";");
		s.createRow(rownum);
		int col = array.length;
		for(j=0;j<col;j++)
		{
			s.getRow(rownum).createCell(j).setCellValue(array[j]);			
		}
	}	
}
