package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{
	
	@And("Enter Company Name (.*)$")
	public void enterCompname(String compName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
	
	}


	@And("Enter First Name (.*)$")
	public void enterFName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	
	}

	@And("Enter Last Name (.*)$")
	public void enterLName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	
	}
	
	@When("Click On Create Lead button")
	public void clickOnClickLeadsButton() {
		driver.findElementByName("submitButton").click();
	}
	
}
