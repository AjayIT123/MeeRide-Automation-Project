package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sheeetindexdemo {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(4);
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(0).getLastCellNum();
		
		for(int row=0;row<=totalrows;row++) {
			XSSFRow r=sheet.getRow(row);
			for(int cell=0;cell<totalcells;cell++) {
				XSSFCell cel=r.getCell(cell);
				
				System.out.printf("%-15s",cel);
			}
			System.out.println();
			
		}
		

	}

}
