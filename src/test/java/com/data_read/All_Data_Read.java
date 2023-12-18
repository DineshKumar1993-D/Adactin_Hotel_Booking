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

public class All_Data_Read {

	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<String>();

		File f = new File("C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\DataRead\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheetAt = wb.getSheetAt(0);

		int rowsize = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row row = sheetAt.getRow(i);

			int cellsize = row.getPhysicalNumberOfCells();

			// for(int j=0;j< cellsize;j++) {

			Cell cell = row.getCell(0);

			CellType typeofcell = cell.getCellType();

			if (typeofcell.equals(CellType.STRING)) {

				String value1 = cell.getStringCellValue();

				list.add(value1);

				// System.out.println(value1);

			} else if (typeofcell.equals(CellType.NUMERIC)) {

				double value2 = cell.getNumericCellValue();

				int value3 = (int) value2;

				System.out.println(value3);
			}

//		}
		}
		System.out.println(list);
	}

}
