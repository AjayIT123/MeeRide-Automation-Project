package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import Base.baseclass;

public class Generalutility extends baseclass {

	public Generalutility(WebDriver driver) {
		this.driver=driver;
	}
	public void screenshot(String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Eclipse\\POM\\Screeshots\\"+name+".png");
		Files.copy(src, dest);
		
	}
}
