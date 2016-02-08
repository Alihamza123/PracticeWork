package practice.images_dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Images {

	static WebDriver driver;

	public static void main(String[] args) {
		// .//*[@id='slideshow']/div[4]/a/img

		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.get("http://www.frys.com");

/*			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='slideshow']/div[4]/a/img")));
*/
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='slideshow']/div[4]/a/img")));
			
			WebElement image = driver.findElement(By.xpath(".//*[@id='slideshow']/div[4]/a/img"));
			image.click();
		} catch (Exception e) {
			System.out.println(" EXCEPTION = " + e);
		}

	}
}
