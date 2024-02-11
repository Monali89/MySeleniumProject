package Selenium_start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
		 EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.flipkart.com/ ");
		 WebElement w1=e1.findElement(By.name("q"));
		 w1.sendKeys("mobile");
		 Thread.sleep(2000);
	List<WebElement> auto =e1.findElements(By.xpath("//div[@class='L0Z3Pu']/ul/li"));
	int count=auto.size();
	auto.get(count-4).click();
	}

}
