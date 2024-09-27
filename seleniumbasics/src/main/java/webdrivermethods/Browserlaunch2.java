package webdrivermethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();//to maximize the screen
		driver.get("https://selenium.qabible.in/");

	}

}
