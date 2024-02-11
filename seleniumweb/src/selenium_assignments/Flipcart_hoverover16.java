package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//Launch Flipkart Hoverover Electronics and Gaming and then click on games
public class Flipcart_hoverover16 {

	public static void main(String[] args) {
		 
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement electronics=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		WebElement electronics=driver.findElement(By.xpath("//span[.='Electronics']"));//xpath for electronics
		 Actions a1=new Actions(driver);
		a1.moveToElement(electronics).perform();
		
		WebElement gaming=driver.findElement(By.linkText("Gaming"));
		Actions a2=new Actions(driver);
		a2.moveToElement(gaming).perform();
		driver.findElement(By.linkText("Games")).click();

	}

}
