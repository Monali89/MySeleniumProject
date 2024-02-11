package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {

	public static void main(String[] args) {
	 EdgeDriver d=new EdgeDriver();
	 d.manage().window().maximize();
	 d.get("https://www.amazon.in/");
	 WebElement option=d.findElement(By.id("searchDropdownBox"));
	 Select s1=new Select(option);
	 s1.selectByValue("search-alias=amazon-devices");

	}

}
