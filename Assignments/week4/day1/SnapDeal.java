package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement mensFashion = driver.findElement(By.xpath("(//li[@class='navlink lnHeight']//span[@class='catText'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		 List<WebElement> ShoesList = driver.findElements(By.xpath("//p[@class='product-title']"));
		 int count = ShoesList.size();
		 
		 System.out.println(count);
		 
		 driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("(//div[@class='sort-drop clearfix']/following-sibling::ul/li)[2]")).click();
	
		
		List<WebElement> sortedShoes = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	for (int i = 0; i < sortedShoes.size(); i++) {
		
			String sortedValues = sortedShoes.get(i).getText().replaceAll("\\D", "");
		System.out.println(sortedValues);
		}

	
	
//		driver.findElement(By.xpath("(//button[text()='View More '])[1]")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()=' Puma ']")).click();
//		
//		
//		driver.findElement(By.xpath("//div[text()='APPLY']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Brand-Puma']")).click();
		
		
		WebElement pumaShoes = driver.findElement(By.xpath("//img[@title='Puma Blue Training Shoes']"));
		
		builder.moveToElement(pumaShoes).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[3]")).click();
		
		
//		WebElement quickView = driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[3]"));
//		builder.moveToElement(quickView).click().perform();
		
		String orgPrice = driver.findElement(By.xpath("//span[@class='strikee ']")).getText().replaceAll("\\D", "");
		System.out.println(orgPrice);
		
		
		
		String disPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText().replaceAll("\\D", "");
		System.out.println(disPrice);
		
		Thread.sleep(2000);
		
		File src = driver.findElementByXPath("(//div[@class='col-xs-11 quickViewModal '])").getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshot/shoes.png");
		FileUtils.copyFile(src, dest);
		
		
	driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
