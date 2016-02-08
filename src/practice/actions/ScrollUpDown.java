package practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpDown {

	static WebDriver driver;
	static String homepage = "https://www.gmail.com/intl/en/mail/help/about.html";

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		Thread.sleep(3L);

		// SCROLL DOWN TO THE BOTTOM OF THE PAGE
		driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a")).sendKeys(Keys.PAGE_DOWN);

		// THEN CLICK ON THE " OUR POLICY " LINK
		driver.findElement(By.xpath(".//*[@id='gmail-footer-list']/li[4]/a")).click();
	}

}
