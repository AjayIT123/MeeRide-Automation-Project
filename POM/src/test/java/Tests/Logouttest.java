package Tests;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Base.baseclass;
import Pages.Loginpage;
import Tests.Bookingstest;
import Pages.Logoutpage;
import Pages.Bookingspage;
public class Logouttest extends baseclass {
	
	Logoutpage applogout;
	Bookingspage bpg;
	@Test
	public void App_Logout() {
		
		Loginpage lp=new Loginpage(driver);
		lp.Logindata("themeeride", "$@Meeride|@|2024^$");

		applogout=new Logoutpage(driver);
		applogout.logoutbtn();
		applogout.app_logout();
		
	}

}
