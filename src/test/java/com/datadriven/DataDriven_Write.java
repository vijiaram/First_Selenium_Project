package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Write {
	
	public static void writeData() throws Throwable {
		
		File f = new File("C:\\Viji\\eclipse-workspace\\Maven_Project\\UserInfo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("Student_Details1");
		Row row = createSheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("S.No");
		wb.getSheet("Student_Details1").getRow(1).createCell(2).setCellValue("Student_Name");
		wb.getSheet("Student_Details1").getRow(1).createCell(3).setCellValue("Department");
		
		wb.getSheet("Student_Details1").createRow(2).createCell(1).setCellValue(1);
		wb.getSheet("Student_Details1").getRow(2).createCell(2).setCellValue("Veda");
		wb.getSheet("Student_Details1").getRow(2).createCell(3).setCellValue("Maths");
		
		wb.getSheet("Student_Details1").createRow(3).createCell(1).setCellValue(2);
		wb.getSheet("Student_Details1").getRow(3).createCell(2).setCellValue("Paavai");
		wb.getSheet("Student_Details1").getRow(3).createCell(3).setCellValue("Science");
		
		wb.getSheet("Student_Details1").createRow(4).createCell(1).setCellValue(2);
		wb.getSheet("Student_Details1").getRow(4).createCell(2).setCellValue("Venbha");
		wb.getSheet("Student_Details1").getRow(4).createCell(3).setCellValue("Tamil");
		
		wb.getSheet("Student_Details1").createRow(5).createCell(1).setCellValue(2);
		wb.getSheet("Student_Details1").getRow(5).createCell(2).setCellValue("Sona");
		wb.getSheet("Student_Details1").getRow(5).createCell(3).setCellValue("English");
		
		wb.getSheet("Student_Details1").createRow(6).createCell(1).setCellValue(2);
		wb.getSheet("Student_Details1").getRow(6).createCell(2).setCellValue("Kavi");
		wb.getSheet("Student_Details1").getRow(6).createCell(3).setCellValue("Social");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
	}

	public static void main(String[] args) throws Throwable {
		
		writeData();
		System.out.println("Data Entered into the Excel File");

	}

}
