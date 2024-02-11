package Selenium_start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println(count);
	//printing all Url
	/*for(int i=0;i<count;i++)
	{
		WebElement link1=links.get(i);
		String url=link1.getText();
		System.out.println(url);*/
		
		//Print url Link Text
		for(int i=0;i<count;i++)
		{
		WebElement link=links.get(i);
		String url=link.getAttribute("href");
		System.out.println(url);
		
		}
	
}
}
