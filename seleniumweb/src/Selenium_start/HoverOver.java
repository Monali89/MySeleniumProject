package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement a2=driver.findElement(By.id("nav-link-accountList"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(a2).perform();
		
		//WebElement a3=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		//a3.click();

	}

}