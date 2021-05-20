package pages.login;

import java.io.IOException;
import org.openqa.selenium.By;
import com.aventstack.extentreports.Status;
import core.Driver;
import utilis.ExtentTestManager;
import utilis.Helper;
import utilis.ReadPropertisFile;


public class LoginController   {
	
	String userEmail;
	String userPassword;
	String signIn;
	
	
	public LoginController()
	{
	try 
		{
		 userEmail = Helper.load("demoshop24.login.email.id");
		 userPassword= Helper.load("demoshop24.login.password.id");
		 signIn=Helper.load("demoshop24.login.singIn.xpath");
		 
		} 
	catch (IOException e) 
		{
			ExtentTestManager.getTest().log(Status.FAIL, e.getMessage());
		}
	}
	public LoginController enterUserEmailAddress()
	{
		String email = null;
		try {
			email = ReadPropertisFile.getExistingUserEmail();
		} catch (IOException e) {

			ExtentTestManager.getTest().log(Status.FAIL,e);
		}
		Driver.findElement(By.id(userEmail)).sendKeys(email);
		return this;
	}
	public LoginController enterPassword() throws IOException
	{
		String password = null;
		password = ReadPropertisFile.getExistingPassword();
		Driver.findElement(By.id(userPassword)).sendKeys(password);
		return this;
	}
	public void signIn()
	{
		Driver.findElement(By.xpath(signIn)).click();
	}



}
