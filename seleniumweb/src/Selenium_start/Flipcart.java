package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		 WebElement option=driver.findElement(By.name("q"));
		 Select s1=new Select(option);
		 s1.selectByValue("mobile");
	}

}
