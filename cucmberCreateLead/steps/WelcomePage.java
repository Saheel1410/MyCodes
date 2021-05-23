package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class WelcomePage extends BaseClass{

	@And("Click on CRMSFA link")
	public void clickLogin() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
}
