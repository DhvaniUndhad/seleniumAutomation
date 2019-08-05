package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("ben");

		JavascriptExecutor jjs = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) jjs.executeScript(script);
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {

			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) jjs.executeScript(script);

		}
		System.out.println(text);
	}

}
