package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//Launch grotechminds/registration and get co-ordinates for any one of the element
public class Assignment_17 {
	public static void main(String[] args) {
		
EdgeDriver driver=new EdgeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();

 WebElement Auto=driver.findElement(By.linkText("Automation Software Testing Course"));
WebElement grotech=driver.findElement(By.linkText("GroTechMinds"));
Point xandy= grotech.getLocation();
Point p1= Auto.getLocation();
   
	System.out.println("Co-ordinates for GroTechMinds");
    int x=xandy.getX();
    int y=xandy.getY();
    System.out.println(x);
    System.out.println(y);
    System.out.println("Co-ordinates for Automation Software Testing Course");
    int x1=xandy.getX();
    int y1=xandy.getY();
    System.out.println(x1);
    System.out.println(y1);
}
}
 