package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchProperties {
	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\selenium2\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	sh.createRow(0).createCell(0).setCellValue("hello");
	sh.createRow(1).createCell(0).setCellValue(123);
	FileOutputStream fos=new FileOutputStream("C:\\selenium2\\Book1.xlsx");
	book.write(fos);
	fos.flush();
	book.close();
	
	}
}
