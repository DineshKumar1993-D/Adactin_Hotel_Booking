package com.data_read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read_New {

	public static void main(String[] args) throws IOException {

		
		List<String> list = new ArrayList<String>();
		
		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\DataRead\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheetAt = wb.getSheetAt(0);

		int rowsize = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row row = sheetAt.getRow(i);

			int rowcell = row.getPhysicalNumberOfCells();

		//	for (int j = 0; j < rowcell; j++) {

				Cell cell = row.getCell(0);

				CellType typeofcell = cell.getCellType();

				if (typeofcell.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();
					
					list.add(value);

			//		System.out.println(value);
					
				} else if (typeofcell.equals(CellType.NUMERIC)) {

					double val = cell.getNumericCellValue();

					int value1 = (int) val;

					System.out.println(value1);
					
			//	}
			}
		}
		
		System.out.println(list);
		
		String s = list.get(2);
		
		System.out.println(s);
	}

}
