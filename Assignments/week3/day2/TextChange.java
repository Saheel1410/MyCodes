package week3.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//driver.findElementByXPath("//button[text()='Click ME!']").click();
		wait.until(ExpectedConditions.visibilityOf(((driver.findElementByXPath("//button[text()='Click ME!']"))))).click();

		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		if (text.contains("Click")) {
			System.out.println("Text is Verified");
		} else {
			System.out.println("Text is not Verified");
		}
	}

}
