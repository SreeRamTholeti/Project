package Task9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class saveImagetoxlsx {
	public static void main(String[] args) throws Exception {
		takeScreenshot TS = new takeScreenshot();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Random_image");
		
		InputStream is = new FileInputStream(TS.clickpic());
		byte[] bytes = IOUtils.toByteArray(is);
		int picture_id = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
		is.close();
		CreationHelper helper = workbook.getCreationHelper();
		Drawing drawing = sheet.createDrawingPatriarch();
		ClientAnchor anchor = helper.createClientAnchor();
		anchor.setCol1(2);
        anchor.setRow1(2);
        Picture picture = drawing.createPicture(anchor, picture_id);
        picture.resize();  
        FileOutputStream fos = new FileOutputStream(new File(".//Image.xlsx"));
        workbook.write(fos);
        workbook.close();
		fos.close();
	}
}
