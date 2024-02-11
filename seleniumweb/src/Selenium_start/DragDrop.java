package Selenium_start;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(0,null);
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(1000);
		WebElement drag=driver.findElement(By.id("drag11"));
		//WebElement drop=driver.findElement(By.xpath(("//div[@ondragover='allowDrop(event)'])[7]")));
		WebElement drop=driver.findElement(By.id("div2"));
		Thread.sleep(1000);
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();

	}
}

