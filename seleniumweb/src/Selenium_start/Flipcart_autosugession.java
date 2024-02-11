package Selenium_start;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_autosugession {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.google.com/");
		 WebElement search=e1.findElement(By.name("q"));
		 search.sendKeys("India");
		 Thread.sleep(2000);
	List<WebElement> auto =e1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=auto.size();
	System.out.println(count);
	auto.get(1).click();
	}

}
