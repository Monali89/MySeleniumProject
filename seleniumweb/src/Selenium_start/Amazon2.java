package Selenium_start;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException 
	{
	EdgeDriver driver= new EdgeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(50000);
    WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    search.sendKeys("tshirt");
    search.sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("( )"));
    String id=driver.getWindowHandle();
    Set<String> pid=driver.getWindowHandles();
    Iterator<String> id1=pid.iterator();
    String parentid=id1.next();
    String childid1=id1.next();
    System.out.println(parentid);
    System.out.println(childid1);
    driver.switchTo().window(childid1);
    Thread.sleep(2000);
    driver.close();
	}

}
