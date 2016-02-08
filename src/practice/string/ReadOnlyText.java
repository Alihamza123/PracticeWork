package practice.string;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadOnlyText {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("www.guru99.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * VERIFY THE INTRODUCTION TEXT
		 * " Guru99 is totally new kind of learning experience. " IS DISPLAYED
		 * CORRECTLY
		 */

		String introText = driver
				.findElement(By.xpath(".//*[@id='rt-showcase']/div/div[1]/div/div/div/div/div[1]/div/div/h2"))
				.getText();
		String expectedText = "Guru99 is totally new kind of learning experience.";
		if (introText.equals(expectedText)) {
			System.out.println(" EXPECTED TEXT / ACTUAL TEXT VERIFICATION PASSED");
		} else {
			System.out.println(" EXPECTED TEXT / ACTUAL TEXT VERIFICATION FAILED");
		}

	}
}
