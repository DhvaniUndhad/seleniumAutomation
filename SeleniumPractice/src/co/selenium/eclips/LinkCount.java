package co.selenium.eclips;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println("total links: " + driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("Footer links: " + footerdriver.findElements(By.tagName("a")).size());
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int totallinks = coloumndriver.findElements(By.tagName("a")).size();
		System.out.println("first block: " + totallinks);

		for (int i = 1; i < totallinks; i++) {

			String tablink = Keys.chord(Keys.COMMAND, Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(tablink);
		}

		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> moveToNextTab = tabs.iterator();

		while (moveToNextTab.hasNext()) {

			driver.switchTo().window(moveToNextTab.next());
			System.out.println(driver.getTitle());
		}

	}

}
