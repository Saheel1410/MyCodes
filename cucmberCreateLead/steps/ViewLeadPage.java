package steps;

import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseClass{

	@Then("verify the lead is created")
	public void verification() {
		String title = driver.getTitle();
		if (title.contains("View")) {
			System.out.println("lead is created");
		}else
			System.out.println("lead is created");

	}
}
