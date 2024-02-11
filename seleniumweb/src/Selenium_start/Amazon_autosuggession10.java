package Selenium_start;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Amazon_autosuggession10 {
public static void main(String[] args) throws InterruptedException {
		EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.amazon.in/");
		 e1.manage().window().maximize();
		 
		 WebElement w1=e1.findElement(By.id("twotabsearchtextbox"));
		 w1.sendKeys("India");
		 
		 Thread.sleep(2000);
	List<WebElement> auto =e1.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	int count=auto.size();
	System.out.println(count);
	
	auto.get(count-6).click();
	Thread.sleep(2000);
	e1.quit();

	}}
 