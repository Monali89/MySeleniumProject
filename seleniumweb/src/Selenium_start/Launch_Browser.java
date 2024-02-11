package Selenium_start;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser
{
	public static void main(String[] args) throws InterruptedException 
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https.www.google.com//");
	//maximum the browser
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	}
}