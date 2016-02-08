package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement slider = driver.findElement(By.id("slider"));

		Actions move = new Actions(driver);

		move.dragAndDropBy(slider, 2, 0).build().perform();

	}

}
