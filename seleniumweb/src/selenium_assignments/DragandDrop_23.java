package selenium_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//Drag and Drop first element and revert back 
//to its original state and drag and drop new element
public class DragandDrop_23 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(0,null);
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(1000);
		
		//Drag and Drop first json element
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

		
		//add new element
		WebElement drag2=driver.findElement(By.id("drag4"));//json where we dropped now dragging 
		WebElement drop2=driver.findElement(By.id("div2"));//drop to actual position
		//WebElement drop2=driver.findElement(By.xpath("//div[@ondragover='allowDrop(event)'][7]"));
		a1.dragAndDrop(drag2,drop2).perform();


	}

}
