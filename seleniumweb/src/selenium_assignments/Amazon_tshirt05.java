package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//Assignment no.5
public class Amazon_tshirt05 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver= new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
	   w1.sendKeys("tshirt");
	    //w1.click();
	    w1.sendKeys(Keys.ENTER);
	    WebElement first_tshirt=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	   first_tshirt.click();
	}

}
