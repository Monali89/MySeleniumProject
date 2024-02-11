package selenium_assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment18
{
public static void main(String[] args) {
EdgeDriver d1=new EdgeDriver();
d1.get("https://grotechminds.com/left-double-click/");
d1.manage().window().maximize();
Actions a1=new Actions(d1);

WebElement double_click1=d1.findElement(By.id("mypopup1"));
a1.doubleClick(double_click1).perform();


//d1.findElement(By.linkText("Link1")).click();
d1.findElement(By.xpath("//*[text()='Link1']")).click();


WebElement doubleclick2=d1.findElement(By.id("mypopup2"));
a1.doubleClick(doubleclick2).perform();

d1.findElement(By.xpath("//*[text()='Link2']")).click();

WebElement doubleclick3=d1.findElement(By.id("mypopup3"));
a1.doubleClick(doubleclick3).perform();

d1.findElement(By.xpath("//*[text()='Link3']")).click();

WebElement doubleclick4=d1.findElement(By.id("mypopup4"));
a1.doubleClick(doubleclick4).perform();

d1.findElement(By.xpath("//*[text()='Link4']")).click();

WebElement doubleclick5=d1.findElement(By.id("mypopup5"));
a1.doubleClick(doubleclick5).perform();

d1.findElement(By.xpath("//*[text()='Link5']")).click();
}
}


