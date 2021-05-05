package week7.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1_irctc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");


		driver.findElementByXPath("//div[@class='text-center col-xs-12']/button").click();
		
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		
		Set<String> winHand = driver.getWindowHandles();
		List<String> winHand1 = new ArrayList<String>(winHand);	
		driver.switchTo().window(winHand1.get(1));
		
		String custMail = driver.findElementByXPath("//a[@class='d-block font-weight-bold']").getText();
	    System.out.println(custMail);
	    
	    driver.switchTo().window(winHand1.get(0)).close();
	    
		

	}

}
