package week5.day2_Assn2;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass01 {
	@BeforeClass
	public void setFileName() {
		excelFileName = "ExcelRead_CreateLead";

	}
	
	
@Test(dataProvider="fetchData")
	public void testCreateLead(String cName,String fName,String secName, String phoNum) {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(secName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(phoNum);
		driver.findElementByName("submitButton").click();
		
}

}


