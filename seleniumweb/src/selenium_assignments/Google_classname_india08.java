package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//Assignment no.8
public class Google_classname_india08 {

	public static void main(String[] args) throws InterruptedException {
		 EdgeDriver e1=new EdgeDriver();
		 e1.get("https://www.google.com/");
		 WebElement w1=e1.findElement(By.className("gLFyf"));
		 w1.sendKeys("India");
		 Thread.sleep(2000);

	}

}
