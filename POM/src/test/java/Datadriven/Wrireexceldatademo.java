package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrireexceldatademo {

	public static void main(String[] args) {
		
		String headers[]= {"Firstname","Age","Place"};
		
		String data[][]= {{"Akshay","3","Hyderabad"},{"Sulochana","51","Mumbai"},{"Phakeer","57","Hyderabad"}};

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet xs=workbook.createSheet("Exceldata");
		XSSFRow xsrow=xs.createRow(0);
		for(int i=0;i<headers.length;i++) {
			XSSFCell cell=xsrow.createCell(i);
			cell.setCellValue(headers[i]);
		}
		for(int i=0;i<data.length;i++) {
			XSSFRow r=xs.createRow(i+1);
			for(int j=0;j<data.length;j++) {
				r.createCell(j).setCellValue(data[i][j]);
			}
		}
		try(FileOutputStream fili=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx")) {
			workbook.write(fili);
			workbook.close();
			System.out.println("File created successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
