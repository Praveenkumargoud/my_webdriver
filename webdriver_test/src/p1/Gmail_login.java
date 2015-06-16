package p1;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login 
{
	WebDriver driver;
	public void open()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.id("lst-ib"));
		w.sendKeys("gmail");
		driver.findElement(By.name("btnG")).click();
		System.out.println("test");
		List<WebElement> ls=driver.findElements((By.partialLinkText("gmail")));
		for(WebElement x:ls)
		{
			System.out.println(x.getText());
		}
		Set<String> ws=driver.getWindowHandles();
		for(String y:ws){
			System.out.println(y);
		}
		driver.findElement(By.linkText("Gmail - Google")).click();
		driver.findElement(By.id("Email")).sendKeys("praveenpuppala13");
		driver.findElement(By.name("signIn")).click();
		driver.findElement(By.id("Passwd")).sendKeys("538952vic");
		driver.findElement(By.id("signIn")).click();
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Inbox")));
		System.out.println("inbox found");
	}
	
	public static void main(String[] args) 
	{
		Gmail_login gl=new Gmail_login();
		gl.open();
	}

}
