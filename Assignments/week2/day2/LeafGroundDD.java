package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDD {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement drop1 = driver.findElementById("dropdown1");
		Select dd1 = new Select(drop1);
		dd1.selectByIndex(1);
		
		WebElement drop2 = driver.findElementByName("dropdown2");
		Select dd2 = new Select(drop2);
		dd2.selectByVisibleText("Appium");
		
		WebElement drop3 = driver.findElementById("dropdown3");
		Select dd3 = new Select(drop3);
		dd3.selectByValue("1");
		
		List<WebElement> drop4 = driver.findElementsByXPath("//select[@class='dropdown']/option");
		System.out.println(drop4.size());
		
		
		driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[5]/select[1]").sendKeys("Selenium");
		
		WebElement eleAct = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option");
		WebElement eleAct2 = driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[4]");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleAct, eleAct2).perform();
	}

}
