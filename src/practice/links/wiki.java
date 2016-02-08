package practice.links;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


		public class wiki {

			public static void main(String[] args) {
				
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
				
				driver.get("https://www.wikipedia.org/");
				
				Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
				
				select.selectByVisibleText("Italiano");
				
				List<WebElement> options = select.getOptions();
				
				options.size();
				
				System.out.println (options.size());
				
				for (int i =0; i<options.size(); i++){
					
					System.out.println (options.get(i).getText());
					System.out.println (options.get(i).getAttribute("lang"));
				
				}
				
			}
	}


