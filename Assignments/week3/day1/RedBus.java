package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.poifs.filesystem.EntryUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.collect.Multiset.Entry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
// static String busString;
// static int fareInt;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//input[@id='src']").sendKeys("C");
		driver.findElementByXPath("//li[@data-id='141']").click();
		driver.findElementById("dest").sendKeys("B");
		driver.findElementByXPath("//li[@data-id='122'][1]").click();
		driver.findElementByXPath("//td[@class='next']//button[1]").click();
		driver.findElementByXPath("//td[@class='we day']").click();
		driver.findElementById("search_btn").click();
		driver.findElementByXPath("//i[@class='icon icon-close c-fs']").click();
		String text = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println(text);

		driver.findElementByXPath("//label[@for='bt_SLEEPER']").click();
		String text2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println(text2);

		driver.findElementByXPath("//label[@for='bt_AC']").click();

		String text3 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println(text3);

		// List<WebElement> listOfFare =
		// driver.findElementsByXPath("//div[@class='seat-fare ']/div//span");
		List<WebElement> listOfBusNames = driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
		// you will get the count of the buses ( for loop itertation count)
	
		
		for (int i = 0; i < listOfBusNames.size(); i++) {
			// get the bus name
			WebElement busName1 = driver
					.findElementByXPath("(//div[@class='travels lh-24 f-bold d-color'])[" + (i + 1) + "]");
			String busString = busName1.getText();
		//System.out.println(busString);
			// get its associated bus fare
			WebElement busFare1 = driver.findElementByXPath(
					"(//div[@class='travels lh-24 f-bold d-color']/following::div/div[@class='fare d-block']/span)["
							+ (i + 1) + "]");
			String text5 = busFare1.getText();
			//System.out.println(text5);
			int fareInt = Integer.parseInt(text5);
			
			// put inside the map
			Map<String, Integer> redbus = new HashedMap<String, Integer>();
			redbus.put(busString, fareInt);
		    
				
			
			//System.out.println(redbus.values());
			}
	
		}

//		List<Integer> busFair = new ArrayList<Integer>();
//		for (int i = 0; i < listOfFare.size(); i++) {
//			String textFare = listOfFare.get(i).getText();
//			String replacedText = textFare.replaceAll("\\D", "");
//			int intFare = Integer.parseInt(replacedText);
//			busFair.add(intFare);
//			
//		}
		// List<WebElement> listOfBusNames =
		// driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");
//		List<String> busName = new ArrayList<String>(); {
//			for (int i = 0; i < listOfBusNames.size(); i++) {
//				String textBusName = listOfBusNames.get(i).getText();
//				
//			}
//		};

//		
//		Collections.sort(busFair);
//		System.out.println(busFair);
//		
//		Integer max = Collections.max(busFair);
//		System.out.println(max);
	
	
	
	
	
	
	
	
//	
//	 int maxAmount = Integer.MIN_VALUE;
//	 for (java.util.Map.Entry<String, Integer> eachBus : redbus.entrySet()) {
//		 Integer value = eachBus.getValue();
//		int max = Math.max(maxAmount, value);
//	}
//System.out.println(maxAmount);
//	
	}


