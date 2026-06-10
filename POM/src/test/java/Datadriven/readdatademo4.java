package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatademo4 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		workbook.cloneSheet(0);
		
		workbook.setSheetName(4,"New Copied exceldata");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		workbook.write(fos);
		
		System.out.println("file created successfully");

	}

}
