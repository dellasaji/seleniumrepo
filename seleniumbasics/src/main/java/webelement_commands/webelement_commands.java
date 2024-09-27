package webelement_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_commands {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Della");
        WebElement lastname =driver.findElement(By.id("LastName"));
        lastname.sendKeys("Saji");
        WebElement email =driver.findElement(By.id("Email"));
        email.sendKeys("dellasaji1@gmail.com");
        WebElement password = driver .findElement(By.xpath("//input[@class='text-box single-line password']"));
        password.sendKeys("Kaloor@17");
        WebElement confpassword = driver.findElement(By.id("ConfirmPassword"));
        confpassword.sendKeys("Kaloor@17");
        WebElement register = driver.findElement(By.id("register-button"));
        register.click();
        WebElement firstname1 = driver.findElement(By.id("FirstName"));
        firstname1.clear();
        String firstname2 = driver.findElement(By.id("FirstName")).getAttribute("class");
        System.out.println(firstname2);
        WebElement sub_button = driver.findElement(By.id("newsletter-subscribe-button"));
        System.out.println(sub_button.getCssValue("display"));
        System.out.println(sub_button.getSize());
        WebElement search = driver.findElement(By.id("small-searchterms"));
        System.out.println(search.getTagName());
        WebElement confirm_pswd=driver.findElement(By.xpath("//label[@for='ConfirmPassword']"));
        System.out.println(confirm_pswd.getText());
        
        
        
        
       driver.close();
	}

}
