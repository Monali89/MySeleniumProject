package selenium_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//Goto grotechminds/draganddrop website,drag the element and drop the 
//element in empty place and again revert the element to its orginal place 
public class DragandDrop_22 {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(0,null);
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(1000);
		WebElement drag=driver.findElement(By.id("drag11"));//json dragging todrop position
		//WebElement drop=driver.findElement(By.id("div2"));//blank is drop position
		WebElement drop=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[7]"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();

	WebElement drag1=driver.findElement(By.id("drag11"));//json where we dropped now dragging 
		//WebElement drop1=driver.findElement(By.id("div1"));//drop to actual position
		WebElement drop1=driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
		a1.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(1000);

//JSON and drop back
	/*	WebElement drag20=driver.findElement(By.id("drag11"));
		WebElement drop20=driver.findElement(By.xpath("(//div[@ondragover='allowDrop(event)'])[7]"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag20, drop20).perform();
		
		WebElement drag21=driver.findElement(By.id("drag11"));
		WebElement drop21=driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
		 
		a1.dragAndDrop(drag21, drop21).perform();
		
		Thread.sleep(2000);*/



}}