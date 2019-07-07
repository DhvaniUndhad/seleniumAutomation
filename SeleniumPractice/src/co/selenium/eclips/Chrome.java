package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");	
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//driver.get("https://www.creditkarma.com/auth/logon");
		//driver.findElement(By.id("username")).sendKeys("This is my first code");
		//driver.navigate().back();
		driver.get("https://www.creditkarma.com/auth/logon");
		//driver.findElement(By.id("username")).sendKeys("Hello");
		//driver.findElement(By.id("password")).sendKeys("Hello");

		//driver.findElement(By.linkText("Sign up now for free")).click();
		driver.findElement(By.xpath("//div[@class='navi-bar_item']//span[@class='text'][contains(text(),'Tax')]")).click();
		//driver.findElement(By.cssSelector("input#Logon.logonBtn")).click();
		//driver.findElement(By.id("").)
		//Thread.sleep(1000);
		//driver.close();
		
	}

}
