package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.alaskaair.com/");
//		Select s = new Select(driver.findElement(By.id("adultCount")));
//		s.selectByVisibleText("2 adults");

		driver.get("https://book.spicejet.com/");
		//System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
	}

}
