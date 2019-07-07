package co.selenium.eclips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchroniz {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1561670690031");
		
		
	}

}
