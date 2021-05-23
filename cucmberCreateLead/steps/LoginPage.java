package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass {

	@And("Enter the url {string}")
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	@And("Type Username {string}")
	public void typeUsername(String username) {
		driver.findElementById("username").sendKeys(username);
	}
	
	@And("Type Password {string}")
	public void typePassword(String password) {
		driver.findElementById("password").sendKeys(password);
	}
	
	@And("Click On Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	
	
	
}
