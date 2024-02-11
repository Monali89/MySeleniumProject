package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_Displayed {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement f_name= driver.findElement(By.name("fname"));
		boolean ansofdisplay=f_name.isDisplayed();
		
		boolean ansofdisplayed=f_name.isEnabled();
		System.out.println(ansofdisplay);
		System.out.println(ansofdisplayed);
		
		WebElement checkbox=driver.findElement(By.id("Agree"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		}

}
