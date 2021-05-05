package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.messages.internal.com.google.protobuf.util.Values;



public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_89.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Ksr Bengaluru",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> trainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		System.out.println(trainNames.size());
		for (WebElement tn : trainNames) {
			System.out.println(tn.getText());
			
		}
		
		Set<WebElement> values = new HashSet<WebElement>(trainNames);
		System.out.println(values.size());
	}
	
}
