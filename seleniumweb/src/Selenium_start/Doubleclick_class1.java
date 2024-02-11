package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_class1 {

			public static void main(String[] args) {
				EdgeDriver driver= new EdgeDriver();
				driver.get("https://www.google.in/");
				driver.manage().window().maximize();
			     WebElement w1= driver.findElement(By.linkText("Gmail"));
				Actions a1=new Actions(driver);
				a1.doubleClick(w1).perform();
}
}