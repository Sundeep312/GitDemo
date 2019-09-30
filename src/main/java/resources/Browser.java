package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser
{
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver intialiseDriver() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/sundeeppamulapati/Flipkart/src/main/java/resources/Drop.properties");
	
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//sundeeppamulapati//Documents//Eclipse-Auto//chromedriver");
			driver=new ChromeDriver();
			
		}
		
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "//Users//sundeeppamulapati//Documents//Eclipse-Auto//firefoxdriver");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		

	}
	

}
