package practice.demoWork;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotDebug {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(3000L);
		
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File(
				"C:\\Users\\Ali Hamza\\Desktop\\EclipseWorkspace\\Practice everything\\src\\practice\\pic.jpeg"));
	
		
		Thread.sleep(3000L);
		
		driver.close();
	}

}
