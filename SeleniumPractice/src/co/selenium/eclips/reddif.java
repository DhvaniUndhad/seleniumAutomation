package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddif {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();;
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("MyFirstCSS");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[value*='Go']")).click();
		//driver.close();
	}

}
