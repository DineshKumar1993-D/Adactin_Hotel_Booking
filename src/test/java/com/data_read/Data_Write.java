package com.data_read;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {

	public static void dataWrite() throws IOException {

		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\DataRead\\Data_Write.xlsx");

		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi);
		
//		wb.createSheet("data").createRow(0).createCell(0).setCellValue("email");
	
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("password");
		
		wb.getSheet("data").getRow(0).createCell(2).setCellValue("user");
	
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("success");
	}
	
	public static void main(String[] args) throws IOException {
		
		dataWrite();
	}

}
