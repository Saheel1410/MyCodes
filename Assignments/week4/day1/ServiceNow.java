package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement frame = driver.findElementById("gsft_main");
		driver.switchTo().frame(frame);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123", Keys.ENTER);
		driver.findElementById("filter").sendKeys("incident", Keys.ENTER);
		Thread.sleep(8000);
		driver.findElementByXPath("(//div[text()='All'])[1]").click();
		WebElement frameBrake = driver.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameBrake);
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='New']").click();
		// Actions builder = new Actions(driver);

		// WebElement newClick = driver.findElementByXPath("//button[text()='New']");
		// builder.moveToElement(newClick).click();

		String incidentNum = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println(incidentNum);

		driver.findElementById("sys_display.incident.caller_id").click();
		driver.findElementById("sys_display.incident.caller_id").sendKeys("Abel tuter", Keys.ENTER);
		Thread.sleep(3000);
		// driver.findElementByXPath("//div[@id='element.incident.caller_id']").click();

		driver.findElementById("incident.short_description").click();
		driver.findElementById("incident.short_description").sendKeys("march interns testleaf", Keys.ENTER);
		driver.findElementByXPath("(//button[text()='Submit'])[1]").click();
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(incidentNum, Keys.ENTER);
		String matchingNUm = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		System.out.println(matchingNUm);
		if (matchingNUm.equals(incidentNum)) {
			System.out.println("The Number Matches");

		} else {
			System.out.println("The Number Not Matches");
		}

	}
//
}
