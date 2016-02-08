package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	static WebDriver driver;
	static String homepage = "http://jqueryui.com/resources/demos/droppable/default.html";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));

		Actions dragdrop = new Actions(driver);
		dragdrop.dragAndDrop(drag, drop).perform();

		// VERIFY THE TEXT "DROPPED" IS SHOWN AFTER DRAG AND DROP
		WebDriverWait dropWait = new WebDriverWait(driver, 10);
		dropWait.until(ExpectedConditions
				.textToBePresentInElement(driver.findElement(By.xpath(".//*[@id='droppable']/p")), "Dropped!"));

		String dropText = driver.findElement(By.xpath(".//*[@id='droppable']/p")).getText();
		String actualText = "Dropped!";
		
		if (dropText.equalsIgnoreCase(actualText)) {
			System.out.println(" DROP TEXT VERIFICATION PASSED ! ");
		} else {
			System.out.println(" DROP TEXT VERIFICATION FAILED ! ");
		}

	}

}
