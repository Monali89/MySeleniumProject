package selenium_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//Assignment no.4
public class Google_xpath04 {

	public static void main(String[] args) throws InterruptedException {
		 EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.google.com/");
		 WebElement w1=e1.findElement(By.name("q"));
		 w1.sendKeys("India");
		 Thread.sleep(2000);
	List<WebElement> auto =e1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=auto.size();
	auto.get(count-4).click();
	}

}
