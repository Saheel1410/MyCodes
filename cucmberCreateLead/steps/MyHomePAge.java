package steps;

import io.cucumber.java.en.And;

public class MyHomePAge extends BaseClass {
	
	@And("Click on Leads")
	public void clickOnLeads() {
		driver.findElementByLinkText("Leads").click();
	}

}
