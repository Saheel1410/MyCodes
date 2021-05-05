package assesment_01;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberDay2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByLinkText("Cucumber").click();
		String text = driver.findElementByXPath("//h1[@class='h1']").getText();
		System.out.println(text);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snapshot/img.png");
		FileUtils.copyFile(screenshotAs, file);
		driver.findElementByClassName("next").click();
		driver.findElementByLinkText("Behavior Driven Development").click();
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		if (title==
				"Introduction to Cucumber Testing | What is Cucumber - javatpoint") {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		

	}

}
