package practice.string;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StringExtractionVerification {

	static WebDriver driver;
	static String homepage = "http://download.cnet.com/windows/";

	public static void main(String[] args) throws IOException {

		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(homepage);

			String firstLink = driver
					.findElement(By
							.xpath(".//*[@id='rb_skin']/div/div[2]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/dl/dd[1]/a"))
					.getText();

			String expectedText = "Security and Antivirus Center";

			if (firstLink.equals(expectedText)) {
				System.out.println(" String Extraction Verification Pass ");
			} else {
				System.out.println(" String Extraction Verification Fail ");
			}
		} catch (Exception e) {
			System.out.println(" STRING EXTRACTION EXCEPTION " + e);
			File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File("C:\\Users\\Ali Hamza\\Pictures"));
		}
	}
}
