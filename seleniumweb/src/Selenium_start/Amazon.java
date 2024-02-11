package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("field-keywords")).sendKeys("plush");
		driver.findElement(By.id("twotabsearchtextbox ")).sendKeys("plush");
		//driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.findElement(By.id(" nav-search-submit-button")).click();
		Thread.sleep(4000);
	}

}
