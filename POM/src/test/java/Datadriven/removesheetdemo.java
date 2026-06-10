package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class removesheetdemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");	
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int totalsheets=workbook.getNumberOfSheets();
		for(int i=0;i<totalsheets;i++) {
			String sheetname=workbook.getSheetName(i);
			if(sheetname.equals("AnotherSheet")) {
				workbook.removeSheetAt(i);
				FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
				workbook.write(fos);
				System.out.println("Sheet removed successfully");
			}
		}
	}
}
