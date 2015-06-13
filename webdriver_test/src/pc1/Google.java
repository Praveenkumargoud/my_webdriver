package pc1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google 
{

	FirefoxDriver driver;
	
	public void open()
	{
	    driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	public void search()
	{
		//WebElement w=driver.findElement(By.id("lst-ib"));
		//w.sendKeys("selenium");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnG")).click();		
	}
	public static void main(String[] args) 
	{
		Google g=new Google();
		g.open();
		g.search();

	}

}
