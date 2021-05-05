package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailUniqueNames {

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
		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
	
	List<String> trainNames = new ArrayList<String>();
	for (WebElement eachTrain : trainList) {
		String trainNamesText = eachTrain.getText();
		trainNames.add(trainNamesText);
		
	}
	System.out.println(trainNames);
	System.out.println(trainNames.size());
	
	//Set<WebElement> trainNew = new LinkedHashSet<WebElement>(trainList);
	
	
		System.out.println(trainList.size());
		for (WebElement tn : trainList) {
			System.out.println(tn.getText());
			
		}
		
		Set<WebElement> values = new HashSet<WebElement>(trainList);
		System.out.println(values.size());
		Set<WebElement> trainNew1 = new LinkedHashSet<WebElement>(trainList);

	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	


