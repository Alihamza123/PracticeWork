package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActCls {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		
		driver.get("http://americangolf.co.uk/");
		
		Actions action = new Actions(driver);
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		
		action.moveToElement(menu).build().perform();


		WebElement men = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[2]/div/div[1]/ul/li[2]/a"));
		
		action.moveToElement(men).build().perform();

	}

}