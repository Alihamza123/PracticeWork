package practice.window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window {

	public static void main(String[] args) {
		
		// CREATE NEW WEBDRIVER INSTANCE AND OPEN FIREFOX
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/Signup");
		
		// ADD IMPLICIT WAIT 		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// CLICK ON THE FOLLOWING LINKS TO TEST 		
		driver.findElement(By.linkText("Terms of Service")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Learn more")).click();
		
		// PRINT PARENT WINDOW TITLE
		System.out.println("Title of the parent window " + driver.getTitle());

		// VERIFY PAGE TITLE OF PARENT WINDOW IS CORRECT
		if (driver.getTitle().equals("Create your Google Account")) {
			System.out.println("Test case Passed");

		} else {
			System.out.println("Test case Failed");
		}

		// SET AND ITERATE WINDOW HANDLES
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iterate = windowIds.iterator();

		String firstWind = iterate.next();
		String secondWind = iterate.next();
		String thirdWind = iterate.next();
		String fourthWind = iterate.next();
		
		// PRINT EACH WINDOW IDs
		System.out.println("Window id of First Window" + firstWind);
		System.out.println("Window id of Second Window" + secondWind);
		System.out.println("Window id of Third Window" + thirdWind);
		System.out.println("Window id of Fourth Window" + fourthWind);

		// SWITCH TO ALL WINDOWS AND MAXIMIZE THEN PRINT PAGE TITLE
		driver.switchTo().window(firstWind);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.switchTo().window(secondWind);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.switchTo().window(thirdWind);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.switchTo().window(fourthWind);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// QUIT BROWSER
		driver.quit();
	}
}
