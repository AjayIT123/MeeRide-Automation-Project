package Pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.baseclass;

public class Bookingspage{
	WebDriver driver;
	public Bookingspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	By bookinglocator=By.xpath("(//span[@class='hide-menu'])[2]");
	By bookingopt=By.cssSelector("select#booking_status");
	By paymentopt=By.cssSelector("select#payment_status");
	public void bookingsearch() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(bookinglocator));
		btn.click();
	}
	public void booking_status() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement booking=wait.until(ExpectedConditions.elementToBeClickable(bookingopt));
		booking.click();
	}
	public void booking_option() {
		WebElement opt=driver.findElement(bookingopt);
		Select s=new Select(opt);
		s.selectByVisibleText("Accepted");
	}
	public void Payment_option() {
		WebElement payopt=driver.findElement(paymentopt);
		payopt.click();
			
	}
	public void Select_Payment_Option() {
		WebElement payopt=driver.findElement(paymentopt);
		Select s=new Select(payopt);
		s.selectByVisibleText("Paid");
	}
}
