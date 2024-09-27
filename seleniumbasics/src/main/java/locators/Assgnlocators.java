package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnlocators {

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
        
        ////textarea[@class='form-control ng-pristine ng-valid ng-touched']//ancestor::div - Ancestor axes method
        ////select[@id='yearbox']//option[@value='1930']//preceding-sibling::option
      //select[@id='yearbox']//option[@value='1930']//following-sibling::option
        
	}

}
