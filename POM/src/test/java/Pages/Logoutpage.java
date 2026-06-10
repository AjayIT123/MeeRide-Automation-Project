package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseclass;

public class Logoutpage {
	WebDriver driver;
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
	}
	By logout=By.xpath("//a[@data-toggle='dropdown']");
	By logclick=By.xpath("(//div[@class='mail-contnet'])[7]");
	
	public void logoutbtn() {
		WebElement logout1=driver.findElement(logout);
		logout1.click();	
	}
	public void app_logout() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logoutclick=wait.until(ExpectedConditions.elementToBeClickable(logclick));
		logoutclick.click();
	}

}
