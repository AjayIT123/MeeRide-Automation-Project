package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.baseclass;

public class Pagefactory_MeerideLogin{
	WebDriver driver;
	public Pagefactory_MeerideLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(css="input#username") WebElement Username;
@FindBy(css="input#password") WebElement Password;
@FindBy(xpath="//button[text()='Log In']") WebElement btn;

public void app_username(String user) {
	Username.sendKeys(user);
}
public void app_password(String passwrd) {
	Password.sendKeys(passwrd);
}
public void app_btn() {
	btn.click();
}
}
