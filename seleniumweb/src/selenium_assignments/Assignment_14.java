package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_14 {

	public static void main(String[] args) {
		 EdgeDriver driver=new EdgeDriver();
		 driver.get("https://grotechminds.com/hoverover/");
		 driver.manage().window().maximize();
		 
		WebElement demo1= driver.findElement(By.xpath("(//div[@class='toolrip4'])[1]"));
		 Actions a1=new Actions(driver);
		 a1.moveToElement(demo1).perform();
		 WebElement practice3=driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		 practice3.click();
		 
		/*WebElement demo4 = driver.findElement(By.xpath("(//div[@class='toolrip6'])"));
		 Actions a4=new Actions(driver); 
		 a4.moveToElement(demo4).perform(); 
		 WebElement practice10 = driver.findElement(By.xpath("(//div[@class='popup6'])[10]"));
		 practice10.click();*/
		 
		//hoverover demo 5 and click on practice 1
		 /*WebElement demo5=driver.findElement(By.xpath("(//div[@class='toolrip7'])[1]"));
		 Actions a5=new Actions(driver);
		 a5.moveToElement(demo5).perform();
		 WebElement practice1=driver.findElement(By.xpath("(//div[@class='popup7'])[1]"));
		 practice1.click();*/
		 
		 
	// hoverover demo 2 and click on practice 6
		/* WebElement demo2=driver.findElement(By.xpath("(//div[@class='toolrip4'])[2]"));
		 Actions a2=new Actions(driver);
		 a2.moveToElement(demo2).perform();
		 WebElement practice6=driver.findElement(By.xpath("(//div[@class='popup7'])[6]"));
		 practice6.click();*/
		 
	


		 
			


		 

	}

}
 