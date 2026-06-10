package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Cloneexceldatareader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook xsw=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=xsw.getSheet("Sheet1");
		
		xsw.cloneSheet(1);
		
		xsw.setSheetName(2, "AnotherSheet");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		xsw.write(fos);
		
		System.out.println("File created successfully");

	}

}
