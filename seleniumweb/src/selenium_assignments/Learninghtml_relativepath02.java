package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//Assignmaent no.3
public class Learninghtml_relativepath02 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/yoges/OneDrive/Documents/learningHTML1.html ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("//input[1]"));
		un.sendKeys("Monali");
		
		WebElement hint =driver.findElement(By.xpath("//input[2]"));
		hint.sendKeys("Monali");
		
		WebElement pwd =driver.findElement(By.xpath("//input[3]"));
		pwd.sendKeys("M123");
		
		WebElement firstname =driver.findElement(By.xpath("//input[4]"));
		firstname.sendKeys("Monali");
		
		//WebElement lastname =driver.findElement(By.xpath("//input[5]"));
		//lastname.sendKeys("Fulsunge");//Disabled
		
		WebElement submit =driver.findElement(By.xpath("//input[6]"));
		submit.click();
		
		WebElement m_boy =driver.findElement(By.xpath("//input[7]"));
		m_boy.click();
		
		WebElement m_girl =driver.findElement(By.name("//input[8]"));
		m_girl.click();
		
		WebElement m_baby =driver.findElement(By.name("//input[9]"));
		m_baby.click();
		
		WebElement male =driver.findElement(By.xpath("//input[11]"));
		male.click();
		
		WebElement female =driver.findElement(By.xpath("//input12]"));
		female.click();
		
		WebElement banglore =driver.findElement(By.xpath("//input[13]"));
		banglore.click();
		
		WebElement signup =driver.findElement(By.xpath("//input[14]"));
		signup.click();
	}

}
