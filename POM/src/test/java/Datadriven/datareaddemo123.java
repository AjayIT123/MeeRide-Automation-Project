package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datareaddemo123 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int totalsheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<totalsheets;i++) {
			String sheetname=workbook.getSheetName(i);
			if(sheetname.equals("AnotherSheet")) {
				XSSFSheet sheet1=workbook.getSheet(sheetname);
				int totalrows=sheet1.getLastRowNum();
				int totalcells=sheet1.getRow(i).getLastCellNum();
				for(int row=0;row<=totalrows;row++) {
					XSSFRow r=sheet1.getRow(row);
					for(int cell=0;cell<totalcells;cell++) {
						XSSFCell cel=r.getCell(cell);
						System.out.printf("%-15s",cel);
					}
					System.out.println();
				}
			}
		}
	}

}
