package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagname_test {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.google.com/");
		 WebElement w1=e1.findElement(By.tagName("textarea"));
		 w1.sendKeys("Mumbai");
		 Thread.sleep(2000);

	}

}
