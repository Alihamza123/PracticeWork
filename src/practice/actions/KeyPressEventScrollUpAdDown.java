package practice.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPressEventScrollUpAdDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/intl/en/mail/help/about.html");
		
		Thread.sleep(3000L);
		
		//Clicking a link
		
		driver.findElement(By.xpath("//*[@id='maia-main']/div[2]/div[2]/div/div[2]/div[1]/div/p/a")).click();
		
		
		Thread.sleep(3000L);
		
		//Using Key event to scroll up
		
		driver.findElement(By.xpath("//*[@id='nav']/li[2])")).sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000L);
		
		
		//Using Key event to scroll down
		
		driver.findElement(By.xpath("//*[@id='nav']/li[2])")).sendKeys(Keys.PAGE_UP);
		
		
	}

}

////*[@id='nav']/li[2])

