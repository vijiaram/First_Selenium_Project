package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	
	
	public static void readSingleData() throws IOException {
		
		File f = new File("C:\\Viji\\eclipse-workspace\\Maven_Project\\UserInfo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		Row row = sheetat.getRow(3);
		Cell cell=row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int intvalue = (int) numericCellValue;
			System.out.println(intvalue);
			
		}

	}
	
	public static void readAllData() throws IOException {
		
		File f = new File("C:\\Viji\\eclipse-workspace\\Maven_Project\\UserInfo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		int numberOfRows = sheetat.getPhysicalNumberOfRows();
		for(int i=0;i<numberOfRows;i++) {
			Row row = sheetat.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<numberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int intvalue = (int) numericCellValue;
					System.out.println(intvalue);
					
				}
			}
			
		}
		

	}
	
	public static void readRowData() throws IOException {
		
		File f = new File("C:\\Viji\\eclipse-workspace\\Maven_Project\\UserInfo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		Row row = sheetat.getRow(3);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for(int j=0; j<numberOfCells;j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int intvalue = (int) numericCellValue;
				System.out.println(intvalue);
				
			}
		}	

	}
	
	public static void readCellData() throws IOException {
		
		File f = new File("C:\\Viji\\eclipse-workspace\\Maven_Project\\UserInfo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetat = wb.getSheetAt(0);
		int numberOfRows = sheetat.getPhysicalNumberOfRows();
		for(int i=0;i<numberOfRows;i++) {
			Row row = sheetat.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int intvalue = (int) numericCellValue;
				System.out.println(intvalue);
				
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		
		System.out.println("---Single Data----");
		readSingleData();
		System.out.println("----All Data-----");
		readAllData();
		System.out.println("----All Data from Single Row----");
		readRowData();
		System.out.println("----All Data from Single Cell----");
		readCellData();

	}

}
