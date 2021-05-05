package assesment_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement brands = driver.findElementByXPath("//li[@class='menu-dropdown-icon']//a");
		WebElement popular = driver.findElementByXPath("//a[text()='Popular']");
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		builder.moveToElement(popular).perform();
		driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();		
		List<String> anotherWin = new ArrayList<String>(windowHandles);
		driver.switchTo().window(anotherWin.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElementByXPath("//div[@class = 'sort-btn clearfix']").click();
		driver.findElementByXPath("(//div[@class = 'control__indicator radio'])[4]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Category'])").click();
		driver.findElementByXPath("//span[text()='Hair']").click();
		driver.findElementByXPath("//span[text()='Hair Care']").click();
		driver.findElementByXPath("//span[text()='Shampoo']").click();
		String text = driver.findElementByXPath("//li[text()='Shampoo']").getText();
		//System.out.println(text);
		if (text.replaceAll("close", "").equals("Shampoo")) {
			System.out.println("Filter is Applied");
			
		}else {
			System.out.println("Filter is not Applied");
		}
		
		driver
		.findElementByXPath("//img[@src='https://images-static.nykaa.com/media/catalog/product/tr:w-276,h-276,cm-pad_resize/8/9/8901526102518_color_protect_shampoo_75ml_82.5ml__i1_1.png']").click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> anotherWin2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(anotherWin2.get(2));
		driver.findElementByXPath("//span[text()='175ml']").click();
		
		
		
	 String text12 = driver.findElementByXPath("(//span[@class='post-card__content-price-offer'])[1]").getText().replaceAll("[^0-9]", "");
	 System.out.println("The amount is : "+text12);
	 driver.findElementByXPath("(//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  '])[1]").click();
	 driver.findElementByXPath("//div[@class='AddBagIcon']").click();
	 String text1 = driver.findElementByXPath("//div[@class='value medium-strong']").getText().replaceAll("\\D", "");
	 System.out.println("The Grand amount is : "+ text1);

Thread.sleep(5000);
	 WebElement proceed = driver.findElementByXPath("(//button[@type='button'])[5]");
	 proceed.click();
	 driver.findElementByXPath("//button[text()='CONTINUE AS GUEST']").click();
	 String text2 = driver.findElementByXPath("//span[text()='220']").getText().replaceAll("\\D","");
	 
		if (text2.equals(text1)) {
			System.out.println("The Total Matched");
			
		}else {
			System.out.println("The Total Not Matched");
			
		}
		driver.quit();
		
		
		
		

	}

}
