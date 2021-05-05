package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElementById("twotabsearchtextbox").sendKeys("one plus 7 pro mobiles",Keys.ENTER); 
		String mobPrice = driver.findElementByXPath("//span[@class='a-price-symbol']/following-sibling::span").getText();
		System.out.println("Price of the mobile : "+mobPrice);

		driver.findElementByXPath("(//div[@class='a-section aok-relative s-image-fixed-height'])/img[1]").click();
		
		Set<String> winHan = driver.getWindowHandles();
		List<String> winHandles = new ArrayList<String>(winHan);
		driver.switchTo().window(winHandles.get(1));
		
		String custRatings = driver.findElementByXPath("(//span[@id='acrCustomerReviewText'])[1]").getText();
		//custRatings.subSequence(beginIndex, endIndex)
		System.out.println("Total number of customers rated : "+custRatings);
		
		Actions builder = new Actions(driver);
		WebElement ratingButton = driver.findElementByXPath("(//a[@class='a-popover-trigger a-declarative'])[1]");
		builder.moveToElement(ratingButton).click().perform();
		
		String starRating = driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold'])").getText();
		System.out.println("Star rated : "+starRating);
		
		driver.findElementById("add-to-cart-button").click();
		
		boolean addCart = driver.findElementByXPath("(//h4[text()='Added to Cart'])[2]").isDisplayed();
		
		if (addCart=true) {
			System.out.println("Added to Cart text message appeared");
		}else {
			System.out.println("Added to Cart text message not appeared");
		}
			driver.findElementByXPath("//span[@id='attach-sidesheet-checkout-button']").click();
			
			String orgTitle = driver.getTitle();
			String compTitle = "Amazon Sign In";
			if (orgTitle.equals(compTitle)) {
				System.out.println("Title is Confirmed");
			}else {
				System.out.println("Title is not Confirmed");
			}
			
			driver.findElementByXPath("//input[@id='continue']").click();
			String orgErr = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
			String compErr ="Enter your email or mobile phone number";
			if (orgErr.contentEquals(compErr)) {
				System.out.println("Error is Appeared");
				
			}else {
				System.out.println("Error is not Appeared");
			}
			
			
	}
	
	
	

}
