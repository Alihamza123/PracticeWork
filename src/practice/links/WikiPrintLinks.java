package practice.links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikiPrintLinks {

	static WebDriver driver;
	static String homepage = "https://www.wikipedia.org/";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get(homepage);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int a = 0; a < links.size(); a++) {
			System.out.println(links.get(a).getText());
			System.out.println(links.get(a).getAttribute("href"));
		}

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		String link52 = allLinks.get(52).getAttribute("href");
		System.out.println(" PRINTING THE #52 LINK : " + link52);

		String expectedUrl = "https://pt.wikipedia.org/";
		if (link52.equals(expectedUrl)) {
			System.out.println(" LINK 52 URL IS SAME AS EXPECTED  - VERIFICATION PASS");
		} else {
			System.out.println(" LINK 52 URL IS NOT THE SAME AS EXPECTED - VERIFICATION FAIL");
		}

	}

}
