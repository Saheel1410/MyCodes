package week3.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnInvisibility {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/disapper.html");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement disElement = driver.findElementByXPath("//button[@id='btn']");
		wait.until(ExpectedConditions.invisibilityOf(disElement));
		boolean displayed = driver.findElementByXPath("//div[@id='show']/p").isDisplayed();
		System.out.println(displayed);
	}

}
