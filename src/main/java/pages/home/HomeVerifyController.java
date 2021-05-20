package pages.home;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import core.Driver;
import utilis.Helper;


public class HomeVerifyController {
	static String title;
	
	
	public HomeVerifyController()
	{
		try {
			title =Helper.load("automationpractice.HomePage.title.xpath");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public  HomeVerifyController PageTitle(String expectedName)
	{
		String actualResult=Driver.findElement(By.xpath(title)).getText();
		Assert.assertEquals(expectedName,actualResult );
		return this;
	}
	public HomeVerifyController SuccessMessageDisplayed() {
		String actualResult=Driver.findElement(By.xpath(title)).getText();
		return this;
		
	}
	
	
}
