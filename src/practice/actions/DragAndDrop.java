package practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;
	static String webpage = "http://demoqa.com/droppable/";
	static By from = By.xpath(".//*[@id='draggableview']");
	static By to = By.xpath(".//*[@id='droppableview']");

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(webpage);

		Actions action = new Actions(driver);

		Thread.sleep(5000);

		action.dragAndDrop(driver.findElement(from), driver.findElement(to)).build().perform();

		if (driver.findElement(to).getText().equalsIgnoreCase("dropped!")) {
			System.out.println("SUCCESSFULLY DRAGGED AND  DROPPED ");
			System.out.println("FROM AFTER LOCATION : " + driver.findElement(from).getLocation());
			System.out.println("TO LOCATION : " + driver.findElement(to).getLocation());
			driver.close();
		} else {
			System.out.println("FAILED DRAG AND DROP");
		}

	}

}
