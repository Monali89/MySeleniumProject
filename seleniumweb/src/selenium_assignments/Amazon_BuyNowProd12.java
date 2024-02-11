package selenium_assignments;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_BuyNowProd12 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		
		WebElement firstprod=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		firstprod.click();
		
		String parentid=driver.getWindowHandle();
		Set<String>parentchildid=driver.getWindowHandles();
		System.out.println(parentid);
		System.out.println(parentchildid);
		
		Iterator<String> pid=parentchildid.iterator();
		String pid1=pid.next();
		String cid1=pid.next();
		driver.switchTo().window(cid1);
		
		
		WebElement buynow=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buynow.click();		
	}

}
