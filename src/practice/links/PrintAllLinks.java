package practice.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {
	
	static String homepage = "http://beginnersbook.com/2013/05/java-abstract-class-method/";
	
	public static void main (String [] args){
		
		WebDriver driver = new FirefoxDriver();
		driver.get(homepage);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 1 ; i <= links.size() ; i ++ ){
			System.out.println(" Name of Link #"+i+links.get(i).getText());
			System.out.println(" URL of Link #"+i+links.get(i).getAttribute("href"));
		}
	}

}
