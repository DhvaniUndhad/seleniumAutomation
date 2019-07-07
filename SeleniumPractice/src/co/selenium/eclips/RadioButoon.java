package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButoon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		// driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text=="Milk") {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}

}
