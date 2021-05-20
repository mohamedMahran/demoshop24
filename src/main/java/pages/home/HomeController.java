package pages.home;

import java.io.IOException;

import org.openqa.selenium.By;
import core.Driver;
import utilis.Helper;


public class HomeController {
	String searchTextBox;
	String searchButton;
	String addToCart;
	String myAccount;
	String login;
	public HomeController()
	{
		try {
			searchTextBox =Helper.load("demoshop24.HomePage.searchTextBox.xpath");
			searchButton = Helper.load("demoshop24.HomePage.searchButton.xpath");
			addToCart=Helper.load("demoshop24.HomePage.addToCart.css");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public void enterProduct(String text)
	{
		Driver.findElement(By.xpath(searchTextBox)).sendKeys(text);
	}

	public void search ()
	{
		Driver.findElement(By.xpath(searchButton)).click();
	}
	public void addToCart()
	{
		Driver.findElement(By.cssSelector(addToCart)).click();
	}
	
	
}
