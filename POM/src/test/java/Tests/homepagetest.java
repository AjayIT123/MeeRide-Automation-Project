package Tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclass;
import Pages.homepage;
import Utilities.Generalutility;
public class homepagetest extends baseclass {

	public homepage hp;
	public Generalutility gu;
	@Test(priority=1,description="Validate searchbox")
	public void tc1() throws IOException {
		driver.get("https://www.Google.com");
		hp=new homepage(driver);
		WebElement ele=hp.searhbox();
		ele.sendKeys("Ajay");
		gu=new Generalutility(driver);
		gu.screenshot("POM");
	}
}
