package Tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.baseclass;
import Pages.Loginpage;
import Tests.Bookingstest;
public class Logintest extends baseclass {
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		
		FileInputStream fio=new FileInputStream("C:\\Users\\hp\\Desktop\\Userinput.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fio);
		
		XSSFSheet sheet=workbook.getSheet("User_Credentials");
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcells=sheet.getRow(0).getLastCellNum();
		
		ArrayList<String> list = new ArrayList<>();
		Loginpage lpg=new Loginpage(driver);
		for(int row=0;row<=totalrows;row++) {
			 
			XSSFRow tr=sheet.getRow(row);
			for(int cell=0;cell<totalcells;cell++) {
				
				XSSFCell cel=tr.getCell(cell);
				
				list.add(cel.getStringCellValue());
				
			}
		}
		for(int li=0;li<list.size();li++) {
			
		lpg.Logindata(list.get(li), list.get(li+1));
		
		}		
	}	
	}
