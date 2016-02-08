package practice.actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions; 

public class DragaAndDrop {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Storing the draggable and droppable objects in WebElement interface 
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id ("droppable"));
		
		
		//Calling the Actions class and passing the driver object in Actions
		Actions action = new Actions (driver);
		
		Thread.sleep(3L);
		action.dragAndDrop(drag, drop).perform();
		
		

	}

}

	
	


