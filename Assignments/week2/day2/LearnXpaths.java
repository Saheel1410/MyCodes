package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpaths {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa", Keys.ENTER);
		driver.findElementById("label").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();

		driver.findElementByXPath("(//table[contains(@class,'dijit dijitReset dijitInline ')])/following-sibling::a[1]")
				.click();
		Set<String> winHandles = driver.getWindowHandles();
		List<String> winHandle = new ArrayList<String>(winHandles);
		driver.switchTo().window(winHandle.get(1));

		String text = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[2]").getText();
	System.out.println(text);
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys(text);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(winHandle.get(0));
		
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']//following-sibling::a").click();
		Set<String> winHandles1 = driver.getWindowHandles();
		List<String> winHandle1 = new ArrayList<String>(winHandles1);
		driver.switchTo().window(winHandle1.get(1));
		
		String text1 = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[3]").getText();
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys(text1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class='linktext'][1]").click();
		
		driver.switchTo().window(winHandle1.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		driver.switchTo().alert().accept();
		String text2 = driver.findElementByXPath("//span[text()='Company Name']/following::span[1]").getText();
		System.out.println(text2);
	}

}

