package Contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) throws Throwable {
		//String Key="webdriver.chrome.driver";
				//String Value="C:\\Users\\RAJ\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
				//System.setProperty(Key, Value);
				//WebDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//fetching data from property file
				FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
				Properties pro=new Properties();
				pro.load(fis);
						 String URL = pro.getProperty("url");
						 String USERNAME = pro.getProperty("username");
						 String PASSWORD = pro.getProperty("password");
						driver.get( URL);
						driver.findElement(By.name("user_name")).sendKeys(USERNAME);
						driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
						driver.findElement(By.id("submitButton")).click();
						driver.findElement(By.linkText("Contacts")).click();
						driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
						Random ran=new Random();
						int ranNum = ran.nextInt(1000);
						FileInputStream fes=new FileInputStream("./src/test/resources/ExcelFeb.xlsx");
						Workbook book=WorkbookFactory.create(fes);
						Sheet sheetname = book.getSheet("Contact");
						Row rowNum = sheetname.getRow(0);
						Cell cellValue = rowNum.getCell(0);
						String prdName = cellValue.getStringCellValue()+ranNum;
						driver.findElement(By.name("salutationtype")).sendKeys("priyanka");
						driver.findElement(By.name("lastname")).sendKeys("Raut");
						driver.findElement(By.id("mobile")).sendKeys("9986917604");
						driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
						Thread.sleep(1000);
						driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
						driver.findElement(By.linkText("Sign Out")).click();
						
	}
	

}
