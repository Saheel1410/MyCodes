package week5.day2_Assn1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass01 {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
@BeforeMethod
	public void preCondtion(String url,String username,String password) {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get(url);
	driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
		
	}

@AfterMethod
public void postCondition() {
driver.close();
}
}
