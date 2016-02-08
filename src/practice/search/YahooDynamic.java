package practice.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooDynamic {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement search = driver.findElement(By.xpath(".//*[@id='p_13838465-p']"));
		search.sendKeys("penguin");
		search.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("penguin pictures")));

		driver.findElement(By.partialLinkText("penguin pictures")).click();

		/*
		 * Thread.sleep(5L); List<WebElement> xpaths =
		 * driver.findElements(By.xpath(
		 * "//*[starts-with(@id,'p_13838465-results')]"));
		 * 
		 * // GET ALL RESULTS LENGTH System.out.println(" XPATHS LINK SIZE = " +
		 * xpaths.size());
		 * 
		 * System.out.println(xpaths.get(0).getAttribute("href")); // GET 4TH
		 * INDEX LINK - PEN String expectedLink = "penguin pictures"; String
		 * actualLink = xpaths.get(4).getText(); if
		 * (actualLink.equals(expectedLink)) { System.out.println(
		 * " EXPECTED RESULT LINK IS SAME AS ACTUAL  "); } else {
		 * System.out.println(" EXPECTED RESULT LINK IS NOT THE SAME AS ACTUAL "
		 * ); }
		 * 
		 */

		// GET PEN PAGE TITLE
		System.out.println(" Penguin pictures Page title = " + driver.getTitle());

		driver.close();
	}
}
