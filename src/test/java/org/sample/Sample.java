package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ralan\\eclipse-workspace\\FrameWork\\Excel\\school.xlsx");
		FileInputStream fins = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fins);
		Sheet sh = w.getSheet("class");
		int phRows = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < phRows; i++) {
			Row r = sh.getRow(i);
			int phCell = r.getPhysicalNumberOfCells();
			for (int j = 0; j < phCell; j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
		}
		
		
		
		
		
		
		
	}

}
