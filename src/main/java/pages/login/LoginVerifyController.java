package pages.login;

import org.testng.Assert;

import core.Driver;

public class LoginVerifyController {

	
	
	public LoginVerifyController()
	{
		
	}
	public  LoginVerifyController URL(String expectedURL)
	{
		String actualURL=Driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains(expectedURL));
		return this;
	}

}
