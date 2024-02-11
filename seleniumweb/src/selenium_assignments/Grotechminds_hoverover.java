package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_hoverover {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		WebElement a2=driver.findElement(By.xpath("//a[@class=elementor-item"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(a2).perform();
		
		WebElement a3=driver.findElement(By.xpath("//a[@class=elementor-flip-box__button elementor-button elementor-size-sm"));
		a3.click();


	}

}
