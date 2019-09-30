package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home

{
public WebDriver driver;
	
	public Home (WebDriver driver) 
	{
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Men')]")
	WebElement men;
	
	@FindBy(xpath="//li[3]//ul[1]//li[1]//ul[1]//li[2]//ul[1]//li[5]//a[1]")
	WebElement Kurtha;
	
	@FindBy(xpath="//div[@class='_3O0U0u']//div[1]//div[1]//div[2]//a[1]")
	WebElement Item;
	

   @FindBy(xpath="//a[@class='_1TJldG _2I_hq9 _2UBURg'][contains(text(),'M')]")
   WebElement Size;
   
   @FindBy(xpath="/button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
   WebElement Buy;
   
   
   public WebElement men()
	{
		return men;
		
	}
   
   public WebElement kurtha()
	{
		return Kurtha;
		
	}
	
   public WebElement Item()
	{
		return Item;
		
	}
   
   public WebElement Buy()
	{
		return Buy;
		
	}
	
   public WebElement Size()
	{
		return Size;
		
	}
	
	

}
