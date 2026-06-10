package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class celliterator_demo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Exceldata");
		
		int totalrows=sheet.getLastRowNum();
		
		int totacells=sheet.getRow(0).getLastCellNum();
		
		/*for (Row row : sheet) {
		    Iterator<Cell> cellIterator = row.cellIterator();

		    while (cellIterator.hasNext()) {
		        Cell cell = cellIterator.next();
		        System.out.printf("%-15s",cell);
		    }
		    System.out.println();
		}*/
		
		for(int row=0;row<=totalrows;row++) {
			
			XSSFRow r=sheet.getRow(row);
			
			Iterator<Cell>ite=r.cellIterator();
			
			while(ite.hasNext()) {
				Cell cel=ite.next();
				System.out.printf("%-15s",cel);
			}
			System.out.println();
		}
		}
		//System.out.println("");

	}



