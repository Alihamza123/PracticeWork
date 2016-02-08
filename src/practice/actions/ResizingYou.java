package practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingYou {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		
		//Storing the resize object in WebElement interface 
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		//Calling the Actions class and passing the driver object in Actions
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		

		//x, y-axis value (600,300)
		action.dragAndDropBy(resize, 600, 300);

	}

}