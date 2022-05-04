package com.pdf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream; 

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.*;

public class JsonToPDF {
	
	public static void jsontopdf(String filename,String content) {
		Document document = new Document();
		try
		{
			File file = new File(filename);
			PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream(file));
			document.open();
			document.add(new Paragraph(content));
			PdfPTable table = new PdfPTable(3);
			document.add(table);
			document.close();
			writer.close();
		} catch (DocumentException e)
		{
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
		

}
