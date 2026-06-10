package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataexceldemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("F:\\Eclipse\\POM\\target\\Exceldata.xlsx");
		
		XSSFWorkbook xsw=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=xsw.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcols=sheet.getRow(0).getLastCellNum();
		
		for(int row=0;row<=totalrows;row++) {
			XSSFRow currentrow=sheet.getRow(row);
			for(int col=0;col<totalcols;col++) {
				XSSFCell cell=currentrow.getCell(col);
				System.out.printf("%-15s",cell.toString());
			}
			System.out.println();
		}

	}

}
