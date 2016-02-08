package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	static WebDriver driver;
	static String homepage = "https://api.jquery.com/dblclick/";

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);
		driver.switchTo().frame(0);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement colorbox = driver.findElement(By.xpath("html/body/div[1]"));

		Actions action = new Actions(driver);
		action.moveToElement(colorbox).doubleClick().build().perform();
	}
}
