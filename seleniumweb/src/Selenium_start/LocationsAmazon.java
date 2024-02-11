package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocationsAmazon {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(50000);
	    WebElement search=driver.findElement(By.linkText("Canada"));
		Point xandy=search.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println(x);
		System.out.println(y);
			}

}
