package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			
		driver.findElement(By.cssSelector(".rArrow.blue")).click();
		driver.findElement(By.cssSelector("input[id='AirlineAutocomplete']")).sendKeys("indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
		
		
		
		
	}

}
