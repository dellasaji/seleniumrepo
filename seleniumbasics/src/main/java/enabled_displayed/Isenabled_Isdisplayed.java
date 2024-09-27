package enabled_displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_Isdisplayed 
{
  //https://demowebshop.tricentis.com/register
	public void verify_isselected()
	{
		boolean isselected;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender =driver.findElement(By.id("gender-male"));
		isselected = gender.isSelected();
		System.out.println("Geneder button before selected" +isselected);
		gender.click();
		isselected = gender.isSelected();
		System.out.println("Geneder button before selected" +isselected);
	}
	public void verify_isenabled()
	{
		boolean isenabled;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement sub_button = driver.findElement(By.id("newsletter-subscribe-button"));
		isenabled= sub_button.isEnabled();
		System.out.println("Susbscription button is enabled" +isenabled);
	}
	
	
	public void verify_isdisplayed()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote_button = driver.findElement(By.id("vote-poll-1"));
		boolean isdisplayed =vote_button.isDisplayed();
		System.out.println("Susbscription button is enabled" +isdisplayed);
	}
	public static void main(String[] args) 
	{
		Isenabled_Isdisplayed obj = new Isenabled_Isdisplayed();
		//obj.verify_isselected();
		//obj.verify_isenabled();
		obj.verify_isdisplayed();
	}
}
