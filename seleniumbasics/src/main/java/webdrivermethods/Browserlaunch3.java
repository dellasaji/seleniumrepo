package webdrivermethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Browserlaunch3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();//to maximize the screen
		driver.get("https://selenium.qabible.in/");

	}

}
