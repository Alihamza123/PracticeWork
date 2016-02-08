package practice.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("www.ebay.com");

		/*
		 * LETS CREATE AN EXCEPTION TO OCCUR ON PURPOSE BY GIVING A FAKE WEB
		 * ELEMENT FOR SYSTEM TO FIND
		 * ---------------------------------------------------------------------
		 * for example : If theres a web element and the driver cant find it for
		 * any reason system will throw exception. So , lets catch the exception
		 * by surrounding with try/catch block. Then print the exception with
		 * system.println then take a screenshot and SAVE IT TO YOUR DESIRED
		 * LOCATION ON YOUR COMPUTER. TO RUN THIS CODE YOU HAVE TO CHANGE THE
		 * PATH FOR THE SCREENSHOT CODE TO YOUR DESKPTOP 
		 * FOR EX :
		 * C:\\Users\Rumu\Desktop\FOLDER
		 */

		try {

			WebElement fakeElement = driver.findElement(By.name("fake_id"));
			fakeElement.click();			

		} catch (Exception e) {

			System.out.println("PRINT OUT THE EXCEPTION " + e);

			/*
			 * THEN CAPTURE SCREENSHOT -- YOU HAVE TO IMPORT
			 *  ( FILE , SCREENSHOT, OUTPUTTYPE , FILEUTILS ) THEN AFTER YOU TYPE THE CODE
			 * THE WHOLE LINE WILL BE RED BECAUSE YOU HAVE TO ADD EXCEPTION MAIN
			 * HOVER MOUSE OVER red line AND ADD THE IOEXCEPTION TO MAIN STATIC
			 */
			File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File("C:\\Users\\Ali Hamza\\Desktop\\Fail1.jpg"));
			
		} finally {
			
			driver.close();

		}

	}
}
