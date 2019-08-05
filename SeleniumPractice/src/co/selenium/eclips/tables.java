package co.selenium.eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/20282/ind-vs-nz-1st-semi-final-1-v-4-icc-cricket-world-cup-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rawcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		int sum = 0;

		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();

			int valueint = Integer.parseInt(value);
			sum = sum + valueint;

		}

		String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extraint = Integer.parseInt(extra);
		int total = sum + extraint;
		System.out.println("Actual: " + total);
		System.out.println(
				"Expected: " + table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());

	}

}
