package selenium_assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Addtocart {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signin=driver.findElement(By.name("email"));
		signin.sendKeys("monali40469@gmail.com");
		
		WebElement clicking=driver.findElement(By.id("continue"));
		clicking.click();
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Monali@123");
		WebElement sign=driver.findElement(By.id("signInSubmit"));
		sign.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("foundation");
		search.sendKeys(Keys.ENTER);
		 
		WebElement addtocart=driver.findElement(By.id("a-autoid-9-announce"));
	    addtocart.click();
	
	    WebElement proceedtocheckout=driver.findElement(By.name("proceedToRetailCheckout"));
	    proceedtocheckout.click();
	    
	    Set<String> child_id = driver.getWindowHandles();
	    System.out.println(child_id);
	
	    Iterator<String> child_id1 = child_id.iterator();
	    String parent_id1 = child_id1.next();// parent id
	    String Child_id12 = child_id1.next();// child id
	    System.out.println(parent_id1);
	    System.out.println(Child_id12);
	    driver.switchTo().window(Child_id12);
	//pp-dGpMkx-79
	 
	}
		
	}