package pages.header;

import java.io.IOException;

import org.openqa.selenium.By;
import core.Driver;
import utilis.Helper;


public class HeaderVerifyController {
	String logout;
	String login;
	
	public HeaderVerifyController()
	{
		try {
			logout =Helper.load("demoshop24.Header.logout.css");
			login = Helper.load("demoshop24.Header.login.css");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void signOut()
	{
		Driver.findElement(By.cssSelector(logout)).click();
	}

	public void signIn()
	{
		Driver.findElement(By.xpath(login)).click();
	}
	public boolean logoutButton() {
		return Driver.findElement(By.cssSelector(logout)).isDisplayed();	
	}
	
}
