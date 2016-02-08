package practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	static WebDriver driver;
	static String webPage = "http://americangolf.co.uk";
	static By golfClubs = By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a");
	static By singleIrons = By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[1]/li/ul/li[2]/ul/li[4]/a");

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.get(webPage);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(golfClubs)).build().perform();
		driver.findElement(singleIrons).click();

	}

}
