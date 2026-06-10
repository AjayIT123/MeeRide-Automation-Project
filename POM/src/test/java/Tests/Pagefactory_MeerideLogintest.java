package Tests;
import org.testng.annotations.Test;

import Base.baseclass;
import Pages.Pagefactory_MeerideLogin;
public class Pagefactory_MeerideLogintest extends baseclass{

	
	Pagefactory_MeerideLogin page;
	@Test
	public void logintest() {
		
		
		page=new Pagefactory_MeerideLogin(driver);
		page.app_username("themeeride");
		page.app_password("$@Meeride|@|2024^$");
		page.app_btn();
		
	}
}
