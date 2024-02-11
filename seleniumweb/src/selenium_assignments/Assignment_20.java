package selenium_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Assignment_20
{
public static void main(String[] args) throws InterruptedException {
EdgeDriver d1= new EdgeDriver();
	//d1.manage().window().maximize(); 
	d1.get("https://www.amazon.in/");  
	
	WebElement category=d1.findElement(By.id("searchDropdownBox")); 
	Thread.sleep(2000);
	
	for(int i=1; i<12; i++)
	{
		category.sendKeys(Keys.ARROW_DOWN);
	}
	category.sendKeys(Keys.ENTER); // books category selected
	
	WebElement searchbar=d1.findElement(By.id("twotabsearchtextbox"));// search bar id
	searchbar.sendKeys("India");// search term for books
	searchbar.sendKeys(Keys.ENTER);// Press enter

}

}
