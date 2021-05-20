package tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pages.header.HeaderPage;
import pages.home.HomePage;
import pages.login.LoginPage;
import utilis.ExtentTestManager;


public class Tests extends BaseTest {

	@Test(priority=2)
	public void validateSearchCriteria( )   {
		try {

			Logger log = Logger.getLogger(Tests.class);
			HomePage homePage =HomePage.getHomePage();
						
			log.info("1. search for “mac” ");
			homePage.step().
						  enterProduct("mac");
			ExtentTestManager.getTest().log(Status.INFO, " 1.Search for Mac");
			log.info("2. Click Search");
			homePage.step().search();
			log.info(Status.PASS);
			ExtentTestManager.getTest().log(Status.INFO, " 2.Verify the results");
			homePage.check().PageTitle("Search - mac");
			
			
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL,e);
		}
	}
	@Test(priority=0)
	public void validateAddToCart()
	{
		try {
			HomePage homePage =HomePage.getHomePage();
			
			log.info("1. search for “mac” ");
			homePage.step().enterProduct("mac");
			log.info(Status.PASS);
			ExtentTestManager.getTest().log(Status.INFO, " 1.search for mac ");
			
			log.info("2. Click Search");
			homePage.step().search();
			log.info(Status.PASS);
			ExtentTestManager.getTest().log(Status.INFO, " 2. Click search ");
			
			log.info("3.add to cart  ");
			homePage.step().addToCart();
			log.info(Status.PASS);	
			homePage.check().
					SuccessMessageDisplayed();
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL,e);
		}
	}
	@Test(priority=1)
	public void validateLogin() throws IOException
	{
		
		LoginPage loginPage =LoginPage.getLoginPage();
		HeaderPage header = HeaderPage.getHeaderPage();
		
		log.info("1. Click on My Account ");
		header.step().openMyAccountMenu();
		log.info(Status.PASS);
		ExtentTestManager.getTest().log(Status.INFO, " 1.Open the Account menu ");
		
		log.info("1. Click login ");
		header.step().logIn();
		log.info(Status.PASS);
		ExtentTestManager.getTest().log(Status.INFO, " 1.Open the Login Page");
		
		loginPage.check().URL("account/login");

		log.info("1. enter user email address and password then sign in ");
		loginPage.step(). enterUserEmailAddress()
						 .enterPassword()
						 .signIn();
		log.info(Status.PASS);
		ExtentTestManager.getTest().log(Status.INFO, " enter username and email address then sign in ");
		
		log.info("1. Click on My Account ");
		header.step().openMyAccountMenu();
		log.info(Status.PASS);
		ExtentTestManager.getTest().log(Status.INFO, " 1.Open the Account menu ");
		
		log.info("Verify the logout button  ");
		header.check().logoutButton();
		
		
	}


}
