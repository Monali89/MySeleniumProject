package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Keys_function {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fname=	driver.findElement(By.id("fname"));
		fname.sendKeys("myname");
		WebElement skills=	driver.findElement(By.id("Skills"));
//		skills.click();
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		//skills.sendKeys(Keys.ENTER);



	}

}
