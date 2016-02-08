package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	static WebDriver driver;
	static String homepage = "www.ebay.com";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions menu = new Actions(driver);

		WebElement electronics = driver
				.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/a"));

		menu.moveToElement(electronics).build().perform();

		WebElement iphone = driver.findElement(
				By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[6]/div[2]/div[1]/ul[2]/li[1]/a"));

		iphone.click();
	}

}
