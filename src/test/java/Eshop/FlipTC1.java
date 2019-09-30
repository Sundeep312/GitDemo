package Eshop;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Login;
import resources.Browser;

public class FlipTC1 extends Browser{
	
	@Test(dataProvider="getData")
	public void navigation (String Username, String Password) throws IOException, InterruptedException
	{
		driver=intialiseDriver();
		driver.get(prop.getProperty("url"));
		
		System.out.println(driver.getTitle());
		
		Login ln=new Login(driver);
		
		Thread.sleep(8000);
		ln.signup().click();
		System.out.println(driver.getTitle());
		//System.out.println(ln.text().getText());
		//driver.switchTo().alert().accept();
		//Actions a=new Actions(driver);
		//a.moveToElement(ln.Email());
		//ln.close().click();
		ln.Email().clear();
		ln.Email().sendKeys(Username);
		ln.Password().clear();
		ln.Password().sendKeys(Password);
		driver.switchTo().alert().dismiss();
			
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="sunnydeepu10@gmail.com";
		data [0][1]="Sunny#331";
		
		return data;
		
		
		
	}

}
