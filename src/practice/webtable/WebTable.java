package practice.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		
		//Counting the row numbers of the table
		
		List <WebElement> rowcounts = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		
		System.out.println ("Total number of rows are: " + rowcounts.size());
		
		System.out.println ("********************************");
		
		//Counting the column numbers of the table
		
		List <WebElement> columncounts = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[120]/td"));
		
		System.out.println ("Total number of columns are: " + columncounts.size());
		
		System.out.println ("********************************");
		
		//Printing the contents of all the rows
		
		for (int i =0; i<rowcounts.size();i++){
			
			System.out.println (rowcounts.get(i).getText());
		}

		//Printing the contents of all the columns
		
				for (int i =0; i<columncounts.size();i++){
					
					System.out.println (columncounts.get(i).getText());
				}
	
				
				//Printing the data of a particular row
				
		List <WebElement> onerow = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]"));
		
		for(int i=0;i<onerow.size(); i++){
			
			System.out.println (onerow.get(i).getText());
		}
	
	

	
				//Printing the data of a particular column
				
				List <WebElement> onecol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
				
				for(int i=0;i<onecol.size(); i++){
					
					System.out.println (onecol.get(i).getText());
				}
				
				System.out.println ("********************************");
				
				//Printing single cell data
				
				List <WebElement> cell = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]"));
				
				for(int i=0;i<cell.size(); i++){
					
					System.out.println (cell.get(i).getText());
				}
	
				System.out.println ("********************************");
			
			//Let us now, print the values from matching columns
			//In that case, index i for both of the column has to be the same
			//For example:we want to print company name and previous close
				
				//Now, company names are in first column
				
				List <WebElement> companyname = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
				
				//And previous close is in the third column
				
				List <WebElement> previousprice = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
				
				for(int i=0;i<companyname.size(); i++){
					
					System.out.println (companyname.get(i).getText() + "********" + previousprice.get(i).getText() );
				}
				
				
				System.out.println ("********************************");	
				
				//Let us now pint the value of one company name and relating previous  price
				
				String compname = "India Cements Lt";

				List <WebElement> compnames = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
				
				
				List <WebElement> preprice = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
				
				for(int i=0;i<compnames.size(); i++){
					
					if(compnames.get(i).getText().equals(compname)){
					
					System.out.println (compnames.get(i).getText() + "********" + preprice.get(i).getText() );
					
					System.out.println ("********************************");
					}
					//Finally, extracting data from each cell
					
		List <WebElement> completedata = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));
					
					for(int j=0;j<completedata.size(); j++){
						
						System.out.println ("********************************");
						
						System.out.println (completedata.get(j).getText());
						
						
						
					}
					
				
				}

}
	
}

