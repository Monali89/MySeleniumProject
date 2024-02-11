package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MktProject {

	public static void main(String[] args) throws InterruptedException
	{
		 
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/yoges/OneDrive/Documents/learningHTML1.html ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("/html/body/input"));
		un.sendKeys("Monali");
		
		WebElement hint =driver.findElement(By.id("2"));
		hint.sendKeys("Monali");
		
		WebElement pwd =driver.findElement(By.id("3"));
		pwd.sendKeys("M123");
		
		WebElement firstname =driver.findElement(By.name("fname"));
		firstname.sendKeys("Monali");
		
		WebElement lastname =driver.findElement(By.name("lname"));
		lastname.sendKeys("Fulsunge");
		
		
	}}