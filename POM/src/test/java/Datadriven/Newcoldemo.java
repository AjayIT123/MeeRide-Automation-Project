package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Newcoldemo {

	public static void main(String[] args) throws IOException {
		
        FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Exceldata");
		
		int totalrows=sheet.getLastRowNum();

		int totalcells=sheet.getRow(0).getLastCellNum();
		
		XSSFRow r=sheet.getRow(0);
		
		XSSFCell cel=r.createCell(0);
	    //cel.setCellValue("S.No");
		
        FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		workbook.write(fos);
		System.out.println("cell created");

}
}
