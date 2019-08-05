package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");

		WebElement table = driver.findElement(By.cssSelector("table[id='product']"));
		int header = table.findElements(By.xpath("//th[text()='Instructor']")).size();
		int totalRaw = table.findElements(By.xpath("//td[text()='Rahul Shetty']")).size();
		int count = header + totalRaw;
		System.out.println("Total count of raw: " + count);
		int colomn = table.findElements(By.tagName("th")).size();
		System.out.println("Total count of colomn: " + colomn);
		System.out.println(table.findElement(By.cssSelector("table[id='product'] tr:nth-child(3)")).getText());

	}

}
