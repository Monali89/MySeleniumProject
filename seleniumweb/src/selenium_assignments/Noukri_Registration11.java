package selenium_assignments;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Launch the Naukari Registartion page and click on Google icon 
//switch to parent to child window & pass email id (getwindowhandles method)
import org.openqa.selenium.edge.EdgeDriver;
public class Noukri_Registration11 {
	public static void main(String[] args) {
	EdgeDriver d1=new EdgeDriver();
	d1.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	d1.manage().window().maximize();
	WebElement google=d1.findElement(By.xpath("//span[@class='google-text']"));
	google.click();
	
	String child=d1.getWindowHandle();
	Set<String> parentchild=d1.getWindowHandles();
	System.out.println(child);
	System.out.println(parentchild);
	
	Iterator<String> id1=parentchild.iterator();
	String parentid=id1.next();
	String childid=id1.next();
	System.out.println(parentid);
	System.out.println(childid);
	d1.switchTo().window(childid);
	WebElement emailid=d1.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
	emailid.sendKeys("89monali@gmail.com");
	
	
	}	 
}
/*Assignment 11 : Launch the Naukari Registartion page and click on Google icon
 switch to parent to child window & pass email id (getwindowhandles method)

public class Assignment11
{
	public static void main(String[] args)
	{
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		d1.manage().window().maximize();

		WebElement google=d1.findElement(By.xpath("//span[@class='google-text']"));
		google.click();
		
		String parentid = d1.getWindowHandle();// gets Parent tab id
		Set<String> ParChid = d1.getWindowHandles();// gets Parent + Child tab id
		System.out.println(parentid);
		System.out.println(ParChid);
		
		Iterator<String> id1 = ParChid.iterator();// Assigning parent+child tab id to iterator to split id's
		String parentid1 = id1.next();//Only parent id assigned to id1
		String Child1=id1.next();// Only child id assigned to id1
		
		System.out.println(parentid1);// Printing only parent id
		System.out.println(Child1);// Printing only child id
		d1.switchTo().window(Child1);// Switching control to child id
		
		WebElement emailid=d1.findElement(By.xpath("//input[@type='email']"));// Xpath for emai id field
		emailid.sendKeys("hmramu@gmail.com");// Type the email id in the email id field.
		
		*/
	
