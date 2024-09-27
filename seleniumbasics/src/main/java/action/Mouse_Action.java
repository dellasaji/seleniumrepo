package action;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) 
	{
		Mouse_Action obj = new Mouse_Action();
		//obj.verify_rightclick();
		//obj.verify_mouseover();
		//obj.drag();//drag and drop
		obj.verify_draganddropusing_offset();

	}
	public void verify_rightclick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action = new Actions(driver);
		action.contextClick(rightclick).build().perform();
		
	}
	public void verify_mouseover()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		WebElement item = driver.findElement(By.xpath("//@[text()='Main Item 2']"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(item).build().perform();
		
	 }
	public void drag()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions dragdrop = new Actions(driver);
		dragdrop.dragAndDrop(drag, drop).build().perform();
	}
	public void verify_draganddropusing_offset()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement dragmebox = driver.findElement(By.id("dragBox"));
		Actions dragme=new Actions(driver);
		dragme.dragAndDropBy(dragmebox, 100, 150).build().perform();
		
	}
	
	

}
