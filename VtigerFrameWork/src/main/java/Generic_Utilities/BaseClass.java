package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POM_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Property_Utility plib=new Property_Utility(); 
	@BeforeSuite
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Parallel Exection");
	}
	@BeforeClass
	//public void BC() throws Throwable
	//{
//Property_Utility plib=new Property_Utility();
		public void BC(String BROWSER)throws Throwable{
		//String BROWSER = plib.getKeysValue("browser");
		//WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
	
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		System.out.println("Lunching Browser");
	}
	@BeforeMethod
	public void BM()
	{
		Login_Page login=new Login_Page(driver);
		
		System.out.println("Login Application");
	}
	@AfterMethod
	public void AM()
	{
		
		System.out.println("Logout Application");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("close the browser");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("parallel execution done");
		
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("DataBase closed");
	}

}
