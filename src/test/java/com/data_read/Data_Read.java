package com.data_read;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {

	public static void main(String[] args) throws IOException {

		File fi = new File("C:\\Users\\pdine\\eclipse-workspace\\Maven_Project8PM\\DataRead\\Data_Read.xlsx");

		FileInputStream f = new FileInputStream(fi);

		Workbook wb = new XSSFWorkbook(f);

		Sheet sheetAt = wb.getSheetAt(0);

		int rowsize = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < rowsize; i++) {

			Row row = sheetAt.getRow(0);

			int cellSize = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellSize; j++) {

				Cell cell = row.getCell(0);

				CellType typeOfcell = cell.getCellType();

				if (typeOfcell.equals(CellType.STRING)) {

					String value = cell.getStringCellValue();

					System.out.println(value);
				} else if (typeOfcell.equals(CellType.NUMERIC)) {

					double num = cell.getNumericCellValue();

					int value1 = (int) num;

					System.out.println(value1);
				}
			}
		}
		wb.close();
	}

}
