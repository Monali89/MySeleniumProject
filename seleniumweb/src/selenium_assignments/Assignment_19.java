package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_19 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver d1= new EdgeDriver();
		d1.manage().window().maximize(); // maximize window
		d1.get("https://www.google.com/"); // go to mentioned url
		
		WebElement searchbar=d1.findElement(By.id("APjFqb"));// google search bar
		searchbar.sendKeys("India");
		Thread.sleep(2000);
		
		for(int i=1; i<6; i++)
		{
			searchbar.sendKeys(Keys.ARROW_DOWN);
		}
		searchbar.sendKeys(Keys.ENTER);

	}

}
