package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Addrowexceldemo {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("New Copied exceldata");
		

        // Column position where new column should be inserted
        int columnIndex = 0;

        // Iterate all rows
        for (Row row : sheet) {

            int lastCell = row.getLastCellNum();
            
            //XSSFRow r=sheet.getRow(columnIndex);
            

            // Shift existing cells to right
            row.shiftCellsRight(columnIndex, lastCell, 1);

            // Create new empty cell
           
        
            row.createCell(columnIndex);
            XSSFRow r=sheet.getRow(columnIndex);
            XSSFCell c=r.getCell(columnIndex);
            c.setCellValue("S.No");
            
        }

        // Write updated workbook
        FileOutputStream fos =
            new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");

        workbook.write(fos);

        // Close resources
        fos.close();
        workbook.close();
        fis.close();

        System.out.println("Empty column inserted successfully");

	}

}
