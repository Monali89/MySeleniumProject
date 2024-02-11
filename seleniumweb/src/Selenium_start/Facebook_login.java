package Selenium_start;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Facebook_login 
{
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	WebElement userid=driver.findElement(By.id("email"));
	userid.sendKeys("89monali2gmail.com");
	WebElement pwd=driver.findElement(By.id("pass"));
	pwd.sendKeys("9960352599");
	WebElement login=driver.findElement(By.name("login"));
	login.click();	
	
}
}
