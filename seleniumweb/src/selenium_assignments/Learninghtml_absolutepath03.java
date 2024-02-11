package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//Assignment no.3
public class Learninghtml_absolutepath03 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/yoges/OneDrive/Documents/learningHTML1.html ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("/html/body/input"));
		un.sendKeys("Monali");
		
		WebElement hint =driver.findElement(By.xpath("/html/body/input[2]"));
		hint.sendKeys("Monali");
		
		WebElement pwd =driver.findElement(By.xpath("/html/body/input[3]"));
		pwd.sendKeys("M123");
		
		WebElement firstname =driver.findElement(By.name("fname"));
		firstname.sendKeys("Monali");
		
		/*WebElement lastname =driver.findElement(By.id("121"));
		lastname.sendKeys("Fulsunge");*///Disabled
		
		WebElement m_boy =driver.findElement(By.name("name1"));
		m_boy.click();
		
		WebElement m_girl =driver.findElement(By.name("name2"));
		m_girl.click();
		
		WebElement m_baby =driver.findElement(By.name("name3"));
		m_baby.click();
		
		WebElement male =driver.findElement(By.xpath("/html/body/input[4]"));
		male.click();
		
		WebElement female =driver.findElement(By.xpath("/html/body/input[5]"));
		female.click();
		
		WebElement banglore =driver.findElement(By.xpath("/html/body/input[6]"));
		banglore.click();
		
		 WebElement option=driver.findElement(By.id("Relegion"));
		 Select s1=new Select(option);
		 s1.selectByValue("Relegion 3");
		 
		 
		driver.findElement(By.linkText("Click to know about us")).click();
		
		
		

	}

}
