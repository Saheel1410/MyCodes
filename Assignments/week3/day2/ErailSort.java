package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
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
		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		List<String> trains = new ArrayList<String>();
		for (int i = 0; i < trainList.size(); i++) {
			
			String trainsName = trainList.get(i).getText();
			trains.add(trainsName);
		}
		Collections.sort(trains);
		System.out.println(trains);
	driver.close();
	}
	

}
