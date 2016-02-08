package practice.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlerts {

	static WebDriver driver;
	static String homepage = "https://www.chase.com/";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click Sign In Without Valid Input
		driver.findElement(By.xpath(".//*[@id='signin-module']/div[1]/div/div/div/form/div/div[5]/a")).click();

		Alert alert = driver.switchTo().alert();
		
		// Print Alert Text
		System.out.println("Alert Text : " + alert.getText());
		
		// Dismiss the alert
		alert.dismiss();
	}

}
