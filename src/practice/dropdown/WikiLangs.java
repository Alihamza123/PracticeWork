package practice.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WikiLangs {

	static WebDriver driver;
	static String homepage = "https://www.wikipedia.org/";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		Select drpdwn = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		List<WebElement> list = drpdwn.getOptions();
		System.out.println("- PRINTING ALL LANGUAGES IN DROP DOWN - ");
		for (int a = 0; a < list.size(); a++) {
			System.out.println(list.get(a).getText());
		}
	}

}
