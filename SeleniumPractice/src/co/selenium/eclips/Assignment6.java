package co.selenium.eclips;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vivekbhalala/Downloads/selenium-java-3.141.59/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		String lable = driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
		Select dmenu = new Select(driver.findElement(By.id("dropdown-class-example")));
		dmenu.selectByValue(lable);
		driver.findElement(By.id("name")).sendKeys(lable);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(lable)){
			System.out.println("Yes, it contains the value.");
		}
		else{
			System.out.println("No, it does not contains the value.");
		}
		
		
	}

}
