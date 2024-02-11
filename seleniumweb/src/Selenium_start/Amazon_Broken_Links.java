package Selenium_start;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Broken_Links 
{
	 
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		List<WebElement> All_List1 = driver.findElements(By.tagName("a"));
		int count = All_List1.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement all_links = All_List1.get(i);
			String url = all_links.getAttribute("href");//Every Link will have common attribute name called "href"
			System.out.println(url);					// There is method called getattribute which is used to get the attribute value which is "href"
			verify_the_link(url);
		}
	}
	
	static void verify_the_link(String eachurl) throws IOException
	{
		try
		{
		URL u1=new URL(eachurl);
		HttpURLConnection w1=	(HttpURLConnection) u1.openConnection();
		w1.connect();
		
		if(w1.getResponseCode()==200)
		{
			System.out.println("URL is Valid"+ w1.getResponseCode() + w1.getResponseMessage() );
		}
		else
		{
			System.out.println("URL is InValid"+ w1.getResponseCode() + w1.getResponseMessage() );

		}
		}
		catch(MalformedURLException a1)
		{
			System.out.println("I have handled this becase some href's have null value");
		}
		
	}
	

}

