package Pages;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import Pages.Logoutpage;
import Base.baseclass;
public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	By username=By.cssSelector("input#username");
	By pwd=By.cssSelector("input#password");
	By button=By.xpath("//button[text()='Log In']");
	
	/*public WebElement username() {
		WebElement ele1=driver.findElement(username);
		return ele1;
	}
	public WebElement password() {
		
		WebElement ele2=driver.findElement(pwd);
		return ele2;
	}
	public WebElement Loginbutton() {
		
		WebElement ele3=driver.findElement(button);
		return ele3;
	}*/
	
	public void Logindata(String uname,String passwrd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(pwd).sendKeys(passwrd);
		driver.findElement(button).click();
		Logoutpage logout=new Logoutpage(driver);
		logout.app_logout();
		logout.logoutbtn();
		
	}

}
