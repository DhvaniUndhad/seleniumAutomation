package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);

		while (!text.equalsIgnoreCase("india")) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
		}
		System.out.println("you got your text");

	}

}
