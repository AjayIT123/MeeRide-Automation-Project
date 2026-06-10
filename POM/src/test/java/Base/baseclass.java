package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseclass {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		//this webdriver setup
		//launch chrome driver.
		//waits used
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");          // run without UI
        options.addArguments("--no-sandbox");        // required in CI
        options.addArguments("--disable-dev-shm-usage"); // avoid memory issues
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://app.themeeride.com/_flash");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
