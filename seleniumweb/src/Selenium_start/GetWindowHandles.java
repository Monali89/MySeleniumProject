package Selenium_start;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class GetWindowHandles 
{
public static void main(String[] args)
	{
	EdgeDriver driver=new EdgeDriver();
	 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	 driver.manage().window().maximize();
	 WebElement w1=driver.findElement(By.xpath(//span[@class='google-text']));
	
	 String parentid=driver.getWindowHandle();
	 Set<String> parentchildid=driver.getWindowHandles();
	 System.out.println(parentid);
	 System.out.println(parentchildid);
	 driver.quit();
	 }

}
