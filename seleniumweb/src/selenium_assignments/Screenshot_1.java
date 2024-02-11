package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot_1 
{
public void Launch_Flipcart()
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("www.flipcart.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("mouse");
	int count=search.size();
	auto.get
	//select s1=new select(option);
	
	
}
}
