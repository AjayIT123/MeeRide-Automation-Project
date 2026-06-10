package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createsheetwithnamedemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		workbook.createSheet("Ajay Selenium");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		System.out.println("file created successfully");
	}

}
