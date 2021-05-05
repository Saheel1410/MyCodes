package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='HyperLink']")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		
	 
		String attribute = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		System.out.println(attribute);
	
		Thread.sleep(1000);
		driver.navigate().to(attribute);
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		String errorLink = driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		
		driver.navigate().to(errorLink);
		
		Thread.sleep(1000);
		String error = driver.getTitle();
		System.out.println(error);
		if (error.contains("404")) {
			System.out.println("Broken");
		}else {
			System.out.println("Not Broken");
		}
		
		Thread.sleep(1000);
		driver.navigate().back();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/h5[text()='HyperLink']")).click();
		
		driver.close();
		
	}

}
