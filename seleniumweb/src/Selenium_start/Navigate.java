package Selenium_start;

import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		 EdgeDriver d =new EdgeDriver();
		 d.get("https://www.google.com/");
		 d.manage().window().maximize();
		 d.navigate().to("https://www.google.com/");
		 Thread.sleep(3000);
		 d.navigate().refresh();
		 d.navigate().forward();
		 d.navigate().back();
	}

}
