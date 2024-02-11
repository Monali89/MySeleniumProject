package Selenium_start;
import org.openqa.selenium.By;
//Assignment no.7
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Grotechmind_Registration
{
public static void main(String[] args) throws InterruptedException
{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Firstname
		WebElement f_name= driver.findElement(By.name("fname"));
		f_name.sendKeys("Monali");
		//Last name
		WebElement l_name= driver.findElement(By.name("lname"));
		l_name.sendKeys("Fulsunge");
		//username
		WebElement u_name= driver.findElement(By.name("Username"));
		u_name.sendKeys("Mona");
		//password
		WebElement u_pwd= driver.findElement(By.id("password"));
		u_pwd.sendKeys("Mona@123");
		//Who are u
				driver.findElement(By.id("Male")).click();
		//skills
		/*WebElement T_skill= driver.findElement(By.id("Skills"));
		Select s2=new Select(T_skill);
	    s2.selectByValue("Technical Skills");
			*/ 
	    WebElement country= driver.findElement(By.id("Country"));
		Select s3=new Select(country);
	    s3.selectByValue("India");
	    //address
		 WebElement P_addr= driver.findElement(By.id("w3review"));
		 P_addr.sendKeys("PeachtreeAtlanta");
		 
		WebElement Per_addr= driver.findElement(By.id("Address"));
		Per_addr.sendKeys("PeachtreeAtlantaGeorgia");
		//pincode
		WebElement P_code= driver.findElement(By.id("Pincode"));
		P_code.sendKeys("30269");
		//religion
		WebElement rel= driver.findElement(By.id("Relegion"));
		Select s1=new Select(rel);
		s1.selectByValue("Hindu");
		//agree	 
		 WebElement relocate=driver.findElement(By.id("Agree"));
		relocate.click();
		
		//resume	
		WebElement text_resume= driver.findElement(By.id("grotech"));
		text_resume.sendKeys(" C:\\Users\\yoges\\grotech.pdf");
		text_resume.submit();
		
	}

} 
 