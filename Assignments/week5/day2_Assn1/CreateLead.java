package week5.day2_Assn1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass01 {
@Test(dataProvider="fetchData",invocationCount=3)
	public void testCreateLead(String cName,String fName,String secName, String phoNum) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(secName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phoNum);
		driver.findElementByName("submitButton").click();
		
}
@DataProvider(name="fetchData")
public String[][] sendData() {
	String[][] data = new String[1][4];
	data[0][0] = "Testleaf";
	data[0][1] = "Saheel";
	data[0][2] = "Khan";
	data[0][3] = "7639981110";
	return data;
}
}


