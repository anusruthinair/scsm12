package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//how to write the data in excel sheet
public class ExcelSheetHandling {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\Tanay My Prince\\Documents\\SCSM1\\Book1.xlsx");
Workbook book=WorkbookFactory.create(fis);
Sheet sh=book.getSheet("Sheet1");
sh.createRow(1).createCell(0).setCellValue("password");
sh.createRow(2).createCell(0).setCellValue("username");
sh.createRow(3).createCell(0).setCellValue("123");
sh.getRow(1).createCell(1).setCellValue("password");
sh.getRow(2).createCell(1).setCellValue("password");
sh.getRow(3).createCell(1).setCellValue("password");
FileOutputStream fos=new FileOutputStream("C:\\Users\\Tanay My Prince\\Documents\\SCSM1\\Book1.xlsx");
book.write(fos);
fos.flush();
System.out.println("pass");
	    
		}
	}

