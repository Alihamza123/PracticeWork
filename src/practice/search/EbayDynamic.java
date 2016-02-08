package practice.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayDynamic {

	static WebDriver driver;
	// xpath 1 = .//*[@id='p_13838465-results']/li[4]/a

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement search = driver.findElement(By.xpath(".//*[@id='gh-ac']"));
		search.sendKeys("pen ");
		search.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("pen")));

		List<WebElement> xpaths = driver.findElements(By.xpath("//*[starts-with(@id,'ui-id')]"));

		// GET ALL RESULTS LENGTH
		System.out.println(" XPATHS LINK SIZE = " + xpaths.size());

		// GET 6TH INDEX LINK - PEN
		String expectedLink = "Pen";
		String actualLink = xpaths.get(6).getText();
		if (actualLink.equals(expectedLink)) {
			System.out.println(" EXPECTED RESULT LINK IS SAME AS ACTUAL  ");
		} else {
			System.out.println(" EXPECTED RESULT LINK IS NOT THE SAME AS ACTUAL ");
		}

		// CLICK ON PEN RESULT INDEX #6
		xpaths.get(6).click();

		// GET PEN PAGE TITLE
		System.out.println(" Pen Page title = " + driver.getTitle());

		driver.close();
	}
}
