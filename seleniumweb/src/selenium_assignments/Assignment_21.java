package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_21 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver d1= new EdgeDriver();
		d1.manage().window().maximize();
		d1.get("https://grotechminds.com/registration/");
		
		d1.findElement(By.id("fname")).sendKeys("Monali");
		d1.findElement(By.id("lname")).sendKeys("Kakde");
		d1.findElement(By.id("Username")).sendKeys("sapna");
		d1.findElement(By.id("password")).sendKeys("89monali@gmail.com");
		d1.findElement(By.id("Female")).click();
		
		WebElement form = d1.findElement(By.id("Skills"));	
		form.sendKeys(Keys.ARROW_DOWN);
		form.sendKeys(Keys.ENTER);
		/*
		 * Select s1 = new Select(form); s1.selectByValue("select1");
		 */
		
		WebElement form1 = d1.findElement(By.id("technicalskills"));
		form1.sendKeys(Keys.ARROW_DOWN);
		form1.sendKeys(Keys.ENTER);
		/*
		 * Select s2 = new Select(form1); s2.selectByValue("Selenium");
		 */
		
		WebElement form2 = d1.findElement(By.id("Country"));
		
		for(int i=1; i<8; i++)
		{
			form2.sendKeys(Keys.ARROW_DOWN);
		}
		/*
		 * Select s3 = new Select(form2); s3.selectByValue("India");
		 */
		form2.sendKeys(Keys.ENTER);
		
		d1.findElement(By.id("w3review")).sendKeys("Mysore,Karnataka");
		d1.findElement(By.id("Address")).sendKeys("Mysore,Karnataka");
		d1.findElement(By.id("Pincode")).sendKeys("570017");
		
		WebElement form3 = d1.findElement(By.id("Relegion"));	
		/*
		 * Select s4 = new Select(form3); s4.selectByValue("Hindu");
		 */
		form3.sendKeys(Keys.ARROW_DOWN);
		form3.sendKeys(Keys.ENTER);
		
		WebElement Resume = d1.findElement(By.id("Resume"));
		Resume.sendKeys("C:\\Users\\20027287\\Downloads\\RHM.pdf");
		d1.findElement(By.id("Agree")).click();
		
		d1.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
		Thread.sleep(10000);
	}


	}


