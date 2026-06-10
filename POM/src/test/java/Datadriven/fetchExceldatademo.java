package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetchExceldatademo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Exceldata");
		int totalrows=sheet.getLastRowNum();
		int totalcols=sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcols);
		
		for(int row=0;row<=totalrows;row++) {
			XSSFRow r=sheet.getRow(row);
			for(int col=0;col<totalcols;col++) {
				XSSFCell cel=r.getCell(col);
				System.out.printf("%-15s",cel);
			}
			System.out.println();
		}

	}

}
