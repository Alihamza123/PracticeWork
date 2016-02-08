package practice.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		//Here we will learn handling JavaScript message
				//Capturing XPATH of the alters created by JavaScript is not possible
				//So we have to find another way
				
				WebDriver driver = new FirefoxDriver();

				driver.get("http://rediff.com");
				
				//Click on the sign-in button
				
				driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
				
				//Now the window that pops up is not JavaScript pop_up
				//So still we can work on any of the element with Web_Driver regular methods
				//Lets click on "go" button
				
				driver.findElement(By.name("proceed")).click();
				
				//See that after clicking on "go" button there pops-up a JavaScript alerts
				
				
				//Let's allow some time in between
				//WE need to import the Thread 
				
				Thread.sleep (2000L);
				
				//Thats the one we will have to deal with
				//Here we need to click "OK" button to close the pop-up alert
				//There is a special class in Web-Driver for it
				//We need to import alert
				//We are switching to Alert class 
				
				Alert a = driver.switchTo().alert();
				
				//Printing the text on the alert
				
				System.out.println ("Here the alert says: " + a.getText());
				
				//Clicking "OK" to accept the JavaScrip alert
				
				a.accept();
				
				//Note: If there is a JavaScript alert that needs to cancel to bypass it
				//We need to use the method ".cancel()" instead of ".accept()
				
			
			}

	}


