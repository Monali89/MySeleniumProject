package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_Exception06 {

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		WebElement First_prod=driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		First_prod.click();
		WebElement buy_now=driver.findElement(By.xpath("//div[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']//ul//li"));
		buy_now.click();

	}//NoSuchElementException

}
