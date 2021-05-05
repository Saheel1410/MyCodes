package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("saheel1410@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(firstName);

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//a[@class='buttontext']")).click();
		WebElement dropdown = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId"));
		Select dd1 = new Select(dropdown);
		dd1.selectByValue("9000");

		driver.findElement(By.xpath("//*[@value='Add']")).click();
		driver.findElement(By.id("updateContactForm_departmentName")).clear();
		driver.findElement(By.id("updateContactForm_departmentName")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String getMarketing = driver.findElement(By.id("viewContact_marketingCampaigns_sp")).getText();
		String compText = "eCommerce Site Internal Campaign";
		if (getMarketing.equals(compText)) {
			System.out.println("text of Marketing campaign is Verified");
		} else {
			System.out.println("text of Marketing campaign is not Verified");
		}

		if (driver.getTitle().contains("View Contact")) {
			System.out.println("Title is Correct");
		} else {
			System.out.println("Title is inCorrect");
		}
	}
}
