package task10;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Word_usingpoi {
	public static void main(String [] args) throws Exception {
		XWPFDocument document = new XWPFDocument();
		XWPFParagraph para = document.createParagraph();
		XWPFParagraph para1 = document.createParagraph();
		XWPFRun run = para.createRun();
		XWPFRun prun = para1.createRun();
		
		para.setAlignment(ParagraphAlignment.CENTER);
		run.setBold(true);
		run.setCapitalized(true);
		run.setFontSize(16);
		run.setText("My 1st document using apache poi");
		run.addBreak();
		
		para1.setAlignment(ParagraphAlignment.LEFT);
		prun.setBold(false);
		prun.setCapitalized(false);
		prun.setFontSize(12);
		prun.setText("Apache POI provides pure Java API for handling Microsoft Office word. We can create new word document, write and read data from Java program.");
		prun.addBreak();
		prun.setText("HWPF (Horrible Word Processor Format) is used to read and write .doc extension files of MS-Word.XWPF (XML Word Processor Format) is used to read and write .docx extension files of MS-Word.We can use either both of the above to create new document, get the paragraphs, pictures, tables, sections, headers etc.");
		
		FileOutputStream fos = new FileOutputStream(new File(".//poi_doc.docx"));
		document.write(fos);
		document.close();
		fos.close();
	}
}
