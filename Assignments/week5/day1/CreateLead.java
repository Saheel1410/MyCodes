package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
@Test
	public void testCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Saheel");
		driver.findElementById("createLeadForm_lastName").sendKeys("Khan");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7639981110");
		driver.findElementByName("submitButton").click();
		
}
}


