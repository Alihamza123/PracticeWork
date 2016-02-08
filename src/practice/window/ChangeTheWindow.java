package practice.window;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeTheWindow {

	//Styling the coding by taking the variables and declaring those static
	  static WebDriver driver = null;
	 
	  static String baseurl ="https://accounts.google.com/SignUp"; 
	
	  public static void main(String[] args) throws InterruptedException {
		
		  //Now we can only use driver instead of WebDriver driver etc.
		 driver=new FirefoxDriver();
		 
		 //Now we can also use the variable baseurl.If we change the url String
		 //variable baseurl will act on the same.
		 driver.get(baseurl);
		 //Let us print the current url to verify
		 System.out.println(driver.getCurrentUrl());
		 System.out.println("********************************************************");
		 
		 //Maximizing the window and setting the global waits 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		
		//Clicking three child windows
		driver.findElement(By.linkText("Terms of Service")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.linkText("Learn more")).click();
		
		//Parent window title will be printed
		System.out.println("Title of first window: "+driver.getTitle());
		System.out.println("************************************************************");
		
		//Each of the window has a special window ids
		//We want to get those window-id's with "getWindowHandles()" method
		//Then we want to Set  those in an array of String
		Set<String> windowids = driver.getWindowHandles();
		
		//Java has an Iterator class
		//we are going to pass the stored window id's
		//As an array of String
		Iterator<String>willIterate= windowids.iterator();
		
		//The base index is 0
		//So we will iterate to each of the windows by using .next method
		
		//This will bring the control to the parent window
		String firstWindow=willIterate.next();
		
		//This will bring the control to the first child window
		String secondWindow=willIterate.next();
		
		//This will bring the control to the second child window
		String thirdWindow=willIterate.next();
		
		//This will bring the control to the third child window
		String fourthWindow=willIterate.next();
		
		//Let us print all the window-id's
		
		//This will print the parent window id
		System.out.println("Window id of first window: " + firstWindow);
		System.out.println("*******************************************************************");
		
		//This will print the first child window id
		System.out.println("Window id of second window: "+ secondWindow);
		System.out.println("*******************************************************************");
		
		//This will print the second child window id
		System.out.println("Window id of third window:  " + thirdWindow);
		System.out.println("*******************************************************************");
		
		//This will print the third child window id
		System.out.println("Window id of fourth window: "+ fourthWindow);
		System.out.println("*******************************************************************");
		
		//Now let us do some actions inside the windows
		//To act on any of the windows we have to swithcTo()the window methods
		
		//Let us move to the first child window
		driver.switchTo().window(secondWindow);	
		driver.manage().window().maximize();
		System.out.println("Title of second window: " +driver.getTitle());
		System.out.println("*******************************************************************");
		//Let us now click on the "Updates" link
		driver.findElement(By.linkText("Updates")).click();
		
		//Let us move to the second child window
		driver.switchTo().window(thirdWindow);
		driver.manage().window().maximize();
		System.out.println("Title of third Window:  " +driver.getTitle());
		System.out.println("*******************************************************************");
		//Let us now click on the "FAQ" link
		driver.findElement(By.linkText("FAQ")).click();
		
		
		//Let us move to the third child window
		driver.switchTo().window(fourthWindow);
		driver.manage().window().maximize();
		//Let us get the title of the third child window
		System.out.println("Title of fourth Window: " +driver.getTitle());
		System.out.println("*******************************************************************");
		
		//Now let us close all the windows starting from the last to the first
		
		//We are now in third child window
		//Let us close it
		System.out.println("Title of fourth window: " +driver.getTitle());
		driver.close();
		
		System.out.println("Closed the third child window");
		System.out.println("*******************************************************************");
		
		//We are now switching to second child window
		//Let us close it
		driver.switchTo().window(thirdWindow);
		System.out.println("Title of third window: " +driver.getTitle());
		driver.close();
		
		System.out.println("Closed the second child window");
		System.out.println("*******************************************************************");
		
		//We are now switching to first child window
		//Let us close it
		driver.switchTo().window(secondWindow);
		System.out.println("Title of second window: " +driver.getTitle());
		driver.close();
		
		System.out.println("Closed the first child window");
		System.out.println("*******************************************************************");
		
		//We are now switching to parent window
		//Let us close it
		driver.switchTo().window(firstWindow);
		System.out.println("Title of first window: " +driver.getTitle());
		driver.close();
		
		System.out.println("Closed the parent window");
		System.out.println("*******************************************************************");

	}

}


