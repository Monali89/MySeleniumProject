package selenium_assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Flipcart_Autosuggesion_product09 
{
public static void main(String[] args) throws InterruptedException {
		EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.flipkart.com/");
		 WebElement otp=e1.findElement(By.xpath("//span[.='✕']"));
		 otp.click();
		 WebElement search=e1.findElement(By.name("q"));
		 search.sendKeys("mobile");
		 Thread.sleep(2000);
	List<WebElement> auto =e1.findElements(By.xpath("//div[@class='_396cs4']"));
	int count=auto.size();
	auto.get(count-4).click();

	}

}
