package pc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{

	FirefoxDriver driver;
	
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
	}
	public void selectprod() throws Exception
	{
		WebElement w=driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		new Actions(driver).moveToElement(w).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HP")).click();
		
	}
	public static void main(String[] args) throws Exception
	{
		Flipkart fk=new Flipkart();
		fk.open();
		fk.selectprod();

	}

}
