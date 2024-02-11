package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_hoverover15 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//WebElement fashion_hoverover=driver.findElement(By.xpath("(//div[@class='_1wE2Px'])"));
	//WebElement fashion_hoverover=driver.findElement(By.xpath("//div[@id='toast-ctn']"));
		WebElement fashion_hoverover=driver.findElement(By.xpath("//span[.='Fashion']"));

		Actions a1=new Actions(driver);
		a1.moveToElement(fashion_hoverover).perform();
		
		WebElement menskurtas=driver.findElement(By.linkText("Men's Kurtas"));
		menskurtas.click();

	}

}
