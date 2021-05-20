package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import core.Driver;
import utilis.ReadPropertisFile;

public class BaseTest {

	WebDriver driver;
	WebDriverWait wait;
	String url ;
	static Logger log = Logger.getLogger(BaseTest.class);
	
	@Parameters("browser")
	@BeforeMethod
	public  void setUp(String browser) 
	{

		driver = Driver.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=Driver.getWebDriverWait();
		try {
			url = ReadPropertisFile.getURL();
		} catch (IOException e) {

			e.printStackTrace();
		}
		driver.get(url);

	}

	@AfterMethod
	public void tearDown() {
		Driver.destoryDriver();
	}

}
