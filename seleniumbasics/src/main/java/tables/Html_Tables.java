package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Tables {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse");
		WebElement showmore = driver.findElement(By.id("showMoreLess"));
		showmore.click();
		WebElement tabledata = driver.findElement(By.xpath("//table[@id='dataTable']"));//to get the full table
		System.out.println(tabledata.getText());
		WebElement singlerow= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));//to get the second row 
		System.out.println(singlerow.getText());
		List<WebElement> row = tabledata.findElements(By.tagName("tr"));
		int rowcount =row.size();
		for(int i=0; i<rowcount; i++)
		{
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			int columncount =column.size();
			
			for(int j=0;j<columncount;j++)
			{
				String celldata = column.get(j).getText();
				if(celldata.equals("NIFTY BANK"))
				{
					System.out.println("Last thread is : " +column.get(1).getText());
				}
			}
		}
		
		
		driver.close();
	}

}
