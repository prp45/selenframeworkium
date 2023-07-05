package Organization;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.Property_Utility;
import POM_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganization {

	public static void main(String[] args) throws Throwable {
		Property_Utility plib=new Property_Utility();
		String BROWSER = plib.getKeysValue("browser");
		WebDriver driver;
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
		
		//String Key="webdriver.chrome.driver";
				//String Value="C:\\Users\\RAJ\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
			//	System.setProperty(Key, Value);
				//WebDriver driver=new ChromeDriver();
				/*WebDriver driver=new ChromeDriver();*/
			driver.manage().window().maximize();
			//	fetching data from property file
				
				//String URL = plib.getKeysValue("url");
				//String USERNAME = plib.getKeysValue("username");
				//String PASSWORD = plib.getKeysValue("password");

				String URL = plib.getKeysValue("url");
				String USERNAME = plib.getKeysValue("username");
				String PASSWORD = plib.getKeysValue("password");
				/*FileInputStream fis=new FileInputStream("C:\\Users\\RAJ\\Desktop\\commondata.properties");
				Properties pro=new Properties();
				pro.load(fis);
				 String URL = pro.getProperty("url");
				 String USERNAME = pro.getProperty("username");
				 String PASSWORD = pro.getProperty("password");*/
				driver.get( URL);
				/*Login_Page login=new Login_Page(driver);
				login.logonToApp(USERNAME, PASSWORD);*/
				
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				driver.findElement(By.linkText("Organizations")).click();
				driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
				Java_Utility jlib=new Java_Utility();
				int ranNum = jlib.getRanDomNum();
				
				//Random ran=new Random();
				//int ranNum = ran.nextInt(1000);
				//Excel_Utility elib=new  Excel_Utility();
				//String orgName = elib.getExcelData("Organization",1,1)+ranNum;			 
				 
				//fetching data from excel
				FileInputStream fes=new FileInputStream("./src/test/resources/ExcelFeb.xlsx");
				Workbook book=WorkbookFactory.create(fes);
				Sheet sheetName = book.getSheet("Organization");
				Row rowNum = sheetName.getRow(1);
				Cell cellNum = rowNum.getCell(1);
				String orgName = cellNum.getStringCellValue()+ranNum;
				
				//add excel data
				driver.findElement(By.name("accountname")).sendKeys(orgName);
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();

	}

}
