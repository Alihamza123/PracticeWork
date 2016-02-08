package practice.links;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikiPrintLinks_1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		
		driver.get("http://www.wikipedia.org");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println (links.size());
		
		for (int p=0; p<links.size();p++){
			
			System.out.println (links.get(p).getAttribute("href"));
			
			System.out.println (links.get(20).getAttribute("href"));
			
			break;
		}

	}

}
