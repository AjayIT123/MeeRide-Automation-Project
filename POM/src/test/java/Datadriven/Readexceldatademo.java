package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldatademo {


	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("F:\\Eclipse\\POM\\target\\Exceldata.xlsx");
		
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet sheet=xs.getSheet("Sheet1");
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		
		DataFormatter formater=new DataFormatter();
		
		System.out.println("total number of rows"+totalrows);
		System.out.println("Total number of cols"+totalcells);
		
		for(int row=0;row<=totalrows;row++) {
			XSSFRow r=sheet.getRow(row);
			for(int col=0;col<totalcells;col++) {
				XSSFCell c=r.getCell(col);
				String data=formater.formatCellValue(c);
				System.out.printf("%-15s",data);
				
			}
			System.out.println();
		}
		xs.close();
		fi.close();
	}

}

