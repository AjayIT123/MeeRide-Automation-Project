package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class columndemo {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Exceldata");
		
		int totalrows=sheet.getLastRowNum();

		int totalcells=sheet.getRow(0).getLastCellNum();
		
		for(int row=0;row<=totalrows;row++) {
			
			XSSFRow r=sheet.getRow(row);
			
			for(int i=1;i<=totalcells;i++) {
				
				XSSFCell oldcell=r.getCell(totalcells-i);
				
				i--;
				
				XSSFCell newcell=r.createCell(totalcells-i);
				
				i++;
				
				newcell.setCellValue(oldcell.getStringCellValue());
				
				oldcell.setBlank();
			}
		}
		XSSFRow r1=sheet.getRow(0);
		XSSFCell c1=r1.getCell(0);
		c1.setCellValue("S.No");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		workbook.write(fos);
		System.out.println("cell created");
	}
}

