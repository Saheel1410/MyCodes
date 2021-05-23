package hooks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.BaseClass;

public class HooksImplementation extends BaseClass {
	public int i = 1;

	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void closeBrowser() {
		driver.close();
	}

	@AfterStep
	public void takeScreenShot() throws IOException {
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./snaps" + (i++) + ".jpg"));
	}

}
