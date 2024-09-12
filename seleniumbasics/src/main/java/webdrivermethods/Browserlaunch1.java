package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//to maximize the screen
		driver.get("https://selenium.qabible.in/");//to open the specified url
		
		String title =driver.getTitle();
		System.out.println("The title of the Webpage is " +title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("The current url of the Webpage is " +currenturl);
		
		String handleid =driver.getWindowHandle();
		System.out.println("The Handleid is  " +handleid);
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		

	}

}
