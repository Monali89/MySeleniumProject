package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Keys_Functionality {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fname=	driver.findElement(By.id("fname"));
		fname.sendKeys("myname");
		fname.sendKeys(Keys.CONTROL+"a");//selecting the entire fname
		fname.sendKeys(Keys.CONTROL+"c");//selecting the entire fname
		
		WebElement lname=	driver.findElement(By.id("lname"));
		lname.sendKeys(Keys.CONTROL+"v");	

	}

}
