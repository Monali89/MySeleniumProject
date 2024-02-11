package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize()	;
		driver.findElement(By.linkText("Gmail")).click();
		WebElement text=driver.findElement(By.id("identifierId"));
		text.sendKeys("89monali@gmail.com");
		text.sendKeys(Keys.ENTER);
		}

}
