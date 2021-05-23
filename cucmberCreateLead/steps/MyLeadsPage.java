package steps;

import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass {
	@And("Click on Create Leads")
	public void clickOnLeads() {
		driver.findElementByLinkText("Create Lead").click();
	}
}
