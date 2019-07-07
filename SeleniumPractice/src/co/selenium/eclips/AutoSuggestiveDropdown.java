package co.selenium.eclips;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
		WebElement source = driver.findElement(By.xpath(
				"//div[@class='flL span4 field_info last_one make_relative from_field_city']//input[@class='ui-state-default ui-combobox-input ui-autocomplete-input ui-widget ui-widget-content ui-corner-left']"));
		source.sendKeys("DEL");
		source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("//span[@class='ui-combobox lightTxt'] //input[@class='ui-state-default ui-combobox-input ui-autocomplete-input ui-widget ui-widget-content ui-corner-left']"));
		destination.sendKeys("MUM");
		destination.sendKeys(Keys.ENTER);

	}

}
