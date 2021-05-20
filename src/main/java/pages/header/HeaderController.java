package pages.header;

import java.io.IOException;

import org.openqa.selenium.By;
import core.Driver;
import utilis.Helper;


public class HeaderController {
	String myAccount;
	String login;
	String logout;
	
	public HeaderController()
	{
		try {
			myAccount= Helper.load("demoshop24.Header.myAccount.css");
			login = Helper.load("demoshop24.Header.login.css");
			logout=Helper.load("demoshop24.Header.logout.css");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void openMyAccountMenu() {
		
		Driver.findElement(By.cssSelector(myAccount)).click();
		
	}
	public void logOut()
	{
		Driver.findElement(By.cssSelector(logout)).click();
	}

	public void logIn()
	{
		Driver.findElement(By.cssSelector(login)).click();
	}
	
}
