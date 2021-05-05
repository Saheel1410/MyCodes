package assesment_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JustDial {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.findElementById("city").clear();
		driver.findElementById("city").sendKeys("Chennai",Keys.ENTER);
		
			
		driver.findElementByXPath("//span[text()='Auto care']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Car Repair']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[text()='Hyundai'])[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[text()='Hyundai Xcent'])[2]").click();
		Thread.sleep(3000);
		//driver.findElementById("//input[@id='srchbx']").clear();
		//Thread.sleep(3000);
		driver.findElementById("srchbx").click();
		
		//driver.findElementByXPath("//input[@id='insrch']").clear();

		Thread.sleep(7000);
		driver.findElementById("insrch").sendKeys("Porur",Keys.ENTER);
		//Thread.sleep(5000);
		
	
		//Thread.sleep(3000);
		//driver.findElementByXPath("//span[text()='Distance ']").click();
		//Thread.sleep(3000);
		//driver.findElementByXPath("//a[text()='1 km']").click();
		
		

	}

}
