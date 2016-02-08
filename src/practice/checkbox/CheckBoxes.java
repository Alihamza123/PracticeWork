package practice.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {

	static WebDriver driver;
	static String homepage = "www.ebay.com";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homepage);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement searchBox = driver.findElement(By.xpath(".//*[@id='gh-ac']"));
		searchBox.sendKeys(" 2015 Toyota Camry");
		WebElement searchSubmit = driver.findElement(By.xpath(".//*[@id='gh-btn']"));
		searchSubmit.click();

		List<WebElement> allCheckbox = driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for (WebElement check : allCheckbox) {
			System.out.println("Checkbox = " + check.getAttribute("name"));

		}

		// SELECT A CHECKBOX IF ANOTHER ONE IS SELECTED
		WebElement firstBox = driver.findElement(By.xpath(".//*[@id='e1-14']"));
		firstBox.click();

		WebElement secondBox = driver.findElement(By.xpath(".//*[@id='e1-16']"));

		if (firstBox.isSelected()) {
			secondBox.click();
		} else {
			firstBox.click();
			secondBox.click();
		}

	}

}
