package practice.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbaySearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();

		driver.get("https://www.ebay.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// SEARCH FOR LAPTOPS
		WebElement searchbox = driver.findElement(By.id("gh-ac"));
		searchbox.click();
		searchbox.sendKeys("laptop");

		// EXPLICIT WAIT FOR RESULT NAMED " LAPTOP STAND " TO SHOW THEN CLICK
		// THE RESULT
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("laptop stand")));

		driver.findElement(By.partialLinkText("laptop stand")).click();

		// VERIFY CORRECT PAGE HAS LOADED
		String actualTitle = driver.getTitle();
		String expectedTitle = "laptop stand | eBay";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(" PAGE TITLE VERIFICATION PASSED ");
		} else {
			System.out.println(" PAGE TITLE VERIFICATION FAILED ");
		}

		driver.close();

	}
}
