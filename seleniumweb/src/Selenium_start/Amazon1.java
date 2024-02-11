package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon1 {

	public static void main(String[] args) 
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("www.google.com");
	driver.get(" https://www.amazon.com/shop/amazon\r\n");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gift");
	driver.findElement(By.linkText(" Amazon Basics")).click();

	}

}
