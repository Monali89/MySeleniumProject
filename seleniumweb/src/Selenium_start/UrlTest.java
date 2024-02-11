package Selenium_start;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest
{
	public static void main(String[] args) throws MalformedURLException
	{
    URL u1=new URL("https://www.google.com/gmail/about/");
	System.out.println(u1.getHost());
	System.out.println(u1.getPath());
    System.out.println(u1.getPort());
    System.out.println(u1.getProtocol());
	
	}
}
