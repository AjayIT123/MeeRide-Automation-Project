package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.baseclass;

public class homepage extends baseclass {
	
	public homepage(WebDriver driver) {
		this.driver=driver;
	}
		By searchlocator=By.xpath("//textarea[@name='q']");
		
		public WebElement searhbox() {
			WebElement ele=driver.findElement(searchlocator);
			return ele;
		}
	}
